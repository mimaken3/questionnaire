package com.example.demo.web;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.domain.Questionnaire;

@Controller
@RequestMapping(value="/")
public class QuestionnaireController {

	// @RequestMappingアノのついているメソッドより先に呼ばれる
	// UserFormオブジェクトを生成
	@ModelAttribute
	public QuestionnaireForm setUpForm() {
		// Springが空のQuestionnaireFormオブジェクトを自動的に
		// Modeオブジェクト(requestスコープ)にセットされる
		return new QuestionnaireForm();
	}

	// 〜:8080/web/としたときに呼ばれる
	@RequestMapping(value="/")
	// Requestスコープを扱うため、Modelオブジェクトを引数として受け取る
	public String index(Model model) {

		// 趣味
		Map<Integer, String>hobbyMap = new LinkedHashMap<Integer, String>();
		hobbyMap.put(1, "野球");
		hobbyMap.put(2, "サッカー");
		hobbyMap.put(3, "テニス");

		// 好きな言語
		List<String> langList = new ArrayList<String>();
		langList.add("Java");
		langList.add("Ruby");
		langList.add("C");

		// requestスコープに先ほど生成したMapオブジェクトを格納
		// input.jsp内のセレクトボックス使われるため
		model.addAttribute("hobbyMap", hobbyMap);
		model.addAttribute("langList", langList);

		// /WEB-INF/views/input.jspへフォワード
		return "input";
	}

	@RequestMapping(value="/create")
	// flashスコープを扱うためのオブジェクト
	public String create(QuestionnaireForm form, RedirectAttributes redirectAttributes) {
		Questionnaire questionnaire = new Questionnaire();
		BeanUtils.copyProperties(form, questionnaire);
		List<String> hobbyList = new ArrayList<String>();
		for(Integer hobbyCode : form.getHobbyList()) {
			switch (hobbyCode) {
			case 1:
				hobbyList.add("野球");
				break;
			case 2:
				hobbyList.add("サッカー");
				break;
			case 3: 
				hobbyList.add("テニス");
				break;
			}
		}
		// 文字の趣味が入ったhobbyListをQuestionnaireオブジェクトにセット
		questionnaire.setHobbyList(hobbyList);
		// flashスコープにQuestionnaireオブジェクトを格納
		redirectAttributes.addFlashAttribute("questionnaire",questionnaire);

		// ダブルサミット対策のため、フォワードではなくリダイレクトを行う
		// リダイレクト後、toresult()メソッドが呼ばれる
		return "redirect:/toresult";
	}

	// 〜:8080/user/toresultでresult.jspへフォワード
	@RequestMapping(value="/toresult")
	public String toresult() {
		return "/result";
	}

}
