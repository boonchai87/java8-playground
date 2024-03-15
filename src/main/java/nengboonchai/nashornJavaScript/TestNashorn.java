package nengboonchai.nashornJavaScript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class TestNashorn {
    public static void main(String args[]) {
      // create the script engine manager   
      ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
      // load the Nashorn javascript engine
      ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
		
      String message = "This is a message";
      String expression = "10 + 2";
      Integer result = null;
      
      try {
         // call the javascript function, pass a java variable	  
         nashorn.eval("print('" + message + "')");
         // call the javascript function and get the result back in java
         result = (Integer) nashorn.eval(expression);
         
      } catch(ScriptException e) {
         System.out.println("Error executing script: "+ e.getMessage());
      }
      System.out.println(result.toString());
   }
}
