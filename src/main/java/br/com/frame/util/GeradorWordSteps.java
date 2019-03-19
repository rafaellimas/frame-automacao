package br.com.frame.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.docx4j.openpackaging.packages.WordprocessingMLPackage;

public class GeradorWordSteps {
	
	 public void generateWord() throws Exception {
	        String path = "report";
	        String fileName = ReportVariables.getNome_cT();
	        FrameworkWordEvidence evidence = new FrameworkWordEvidence();
	        WordprocessingMLPackage template = evidence.getTemplate("template/template_evidencias.docx");
	        evidence.replacePlaceholder(template, ReportVariables.getAmbiente(), "<ambiente>");
	        String timeStamp = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
	        evidence.replacePlaceholder(template, timeStamp, "<data>");
	        evidence.replacePlaceholder(template, ReportVariables.getNome_cT(), "<id_nomeCT>");
	        evidence.replacePlaceholder(template, ReportVariables.getObjetivo(), "<objetivo>");
	        evidence.replacePlaceholder(template, ReportVariables.getLabel_resultado_esperado(), "<resultado_esperado>");
	        evidence.replacePlaceholder(template, ReportVariables.getStatus(), "<resultado_obtido>");
	        evidence.replacePlaceholder(template, ReportVariables.getExecutor(), "<executor>");
	        evidence.replacePlaceholder(template, ReportVariables.getSprint(), "<sp>");
	        evidence.replacePlaceholder(template, ReportVariables.getCiclo(), "<cdt>");
	        evidence.createWordEvidence(template, path, fileName);
	    }

}
