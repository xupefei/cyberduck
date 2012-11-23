package ch.cyberduck.core.analytics;

import ch.cyberduck.core.AbstractTestCase;
import ch.cyberduck.core.Credentials;
import ch.cyberduck.core.Protocol;
import ch.cyberduck.core.Scheme;

import org.junit.Assert;
import org.junit.Test;

/**
 * @version $Id$
 */
public class QloudstatAnalyticsProviderTest extends AbstractTestCase {

    @Test
    public void testGetSetupS3() throws Exception {
        QloudstatAnalyticsProvider q = new QloudstatAnalyticsProvider();
        Assert.assertEquals("https://qloudstat.com/configuration/add?setup=cHJvdmlkZXI9czMuYW1hem9uYXdzLmNvbSxwcm90b2NvbD1odHRwLGVuZHBvaW50PWN5YmVyZHVjay10ZXN0aW5nLGtleT1xbG91ZHN0YXQsc2VjcmV0PXNlY3JldA%3D%3D",
                q.getSetup(Protocol.S3_SSL, Scheme.http, "cyberduck-testing", new Credentials("qloudstat", "secret")));
    }

    @Test
    public void testGetSetupCloudFrontStreaming() throws Exception {
        QloudstatAnalyticsProvider q = new QloudstatAnalyticsProvider();
        Assert.assertEquals("https://qloudstat.com/configuration/add?setup=cHJvdmlkZXI9Y2xvdWRmcm9udC5hbWF6b25hd3MuY29tLHByb3RvY29sPXJ0bXAsZW5kcG9pbnQ9Y3liZXJkdWNrLXRlc3Rpbmcsa2V5PXFsb3Vkc3RhdCxzZWNyZXQ9c2VjcmV0",
                q.getSetup(Protocol.CLOUDFRONT, Scheme.rtmp, "cyberduck-testing", new Credentials("qloudstat", "secret")));
    }
}
