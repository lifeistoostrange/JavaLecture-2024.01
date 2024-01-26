package extra_crawling.sec03_melon;

import java.io.IOException;
import java.util.List;

public class MellonMain {

	public static void main(String[] args) throws IOException {
		MelonChartService melonChartService = new MelonChartService();
		List<MelonChart> list = melonChartService.getMellonChart();
		list.forEach(x -> System.out.println(x));

	}

}
