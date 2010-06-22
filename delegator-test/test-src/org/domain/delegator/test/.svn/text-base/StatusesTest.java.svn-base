package org.domain.delegator.test;

import org.testng.annotations.Test;
import org.jboss.seam.mock.SeamTest;

public class StatusesTest extends SeamTest {

	@Test
	public void test_statuses() throws Exception {
		new FacesRequest() {
			@Override
			protected void invokeApplication() {
				//call action methods here
				invokeMethod("#{Statuses.statuses}");
			}
		}.run();
	}
}
