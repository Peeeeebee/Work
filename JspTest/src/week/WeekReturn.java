package week;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WeekReturn extends HttpServlet {

	public void doPost(	HttpServletRequest request,
				HttpServletResponse response)
				throws IOException, ServletException
	{
		// 曜日の定義
		String week[] = {"","日","月","火","水","木","金","土"};

		// 値の取得＆設定
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		request.setAttribute("year", year);
		request.setAttribute("month", month);
		request.setAttribute("day", day);

		// 曜日の取得
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(year),
				Integer.parseInt(month)-1,
				Integer.parseInt(day));
		request.setAttribute("week",
				week[cal.get(Calendar.DAY_OF_WEEK)]);

		// result.jspへ遷移
		getServletConfig().getServletContext().
				getRequestDispatcher("/jsp/result.jsp" ).
				forward( request, response );
	}
}