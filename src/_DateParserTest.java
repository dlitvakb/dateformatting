package src;

import junit.framework.Assert;

import org.junit.Test;

public class _DateParserTest {

	@Test
	public void quieroConvertirUnStringEnUnaFechaFormatoISO8601() {
		String fechaRaw = "20120630";
		Assert.assertEquals("la fecha deberia ser", new ISOFormatDate(2012, 06,
				30), new DateParser(fechaRaw).toISOFormat());
	}
}
