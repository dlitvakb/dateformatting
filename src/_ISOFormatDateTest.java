package src;

import junit.framework.Assert;

import org.junit.Test;

public class _ISOFormatDateTest {

	@Test
	public void isoDatesShouldFormatCorrectly() {
		ISOFormatDate date = new ISOFormatDate(2012, 06, 30);
		Assert.assertEquals("la fecha deberia ser", "2012-06-30",
				date.toString());
	}

}
