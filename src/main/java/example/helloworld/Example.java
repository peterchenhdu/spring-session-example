package example.helloworld;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.*;

@RestController
public class Example {

	@RequestMapping("/set")
	String set(HttpServletRequest req) {
		req.getSession().setAttribute("testKey", "testValue");
		return "设置session:testKey=testValue";
	}

	@RequestMapping("/query")
	String query(HttpServletRequest req) {
		Object value = req.getSession().getAttribute("testKey");
		return "查询Session：\"testKey\"=" + value;
	}

}