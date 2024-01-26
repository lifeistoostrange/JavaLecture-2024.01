package extra_crawling.sec01_human_edu;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Exercise {

	public static void main(String[] args) throws IOException {
		String url = "https://www.human.or.kr/";
		Document doc = Jsoup.connect(url).get();
		Element strong = doc.selectFirst(".f_right > strong");
		System.out.println(strong.text());

		Element address = doc.selectFirst(".f_left > address");
//		System.out.println(address.text());
		String[] addressArray = address.html().split("<br>");
		for (String adr : addressArray) {
//			System.out.println(adr);
		}
		List<String> addressList = new ArrayList<String>();
		for (String addr : addressArray) {
			addressList.add(addr.strip());
		}
		addressList.forEach(x -> System.out.println(x));

		// 다중 Element 탐색
//		url = "https://www.human.or.kr/program?sca=%EC%88%98%EC%9B%90";
//		url = "https://www.human.or.kr/program?sca=" + URLEncoder.encode("수원", "utf-8");
//		doc = Jsoup.connect(url).get();

//		Elements lis = doc.select(".dp_li.num-1");
//		System.out.println(lis.size());

//		Element li = lis.get(0);			// lis들 중 가장 앞에있는 원소 li 
//		String title = li.selectFirst(".txt_wrap > h2").text().strip();
//		String desc = li.selectFirst(".txt_content").text().strip();
//		System.out.println(title);
//		System.out.println(desc);

//		for (Element li : lis) {
//			String title = li.selectFirst(".txt_wrap > h2").text().strip();
//			String desc = li.selectFirst(".txt_content").text().strip();
//			System.out.println(title);
//			System.out.println(desc);
//			System.out.println("==========================================");
//		}

		// 서울, 수원, 천안의 과정 출력

		for (String place : new String[] { "서울", "수원", "천안" }) {
			url = "https://www.human.or.kr/program?sca=" + URLEncoder.encode(place, "utf-8");
			doc = Jsoup.connect(url).get();

			Elements lis = doc.select(".dp_li.num-1");
			System.out.println(place + " 과정수:" + lis.size());

			for (Element li : lis) {
				String title = li.selectFirst(".txt_wrap > h2").text().strip();
				String desc = li.selectFirst(".txt_content").text().strip();
				System.out.println(title);
//				System.out.println(desc);
			}
			System.out.println("==========================================");
		}
	}

}
