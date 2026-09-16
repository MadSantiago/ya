package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: ۥًٗؓؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1518 extends AbstractC2474 {

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ int f5158;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1518(C5034 c5034, int i) {
        super(c5034);
        this.f5158 = i;
    }

    @Override // p000.AbstractC2474
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo2428() {
        int i = this.f5158;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public void m3249(String str, C1379 c1379, C2533 c2533, InterfaceC2697 interfaceC2697) {
        String str2;
        String str3 = c1379.f4727;
        C5371 c5371 = (C5371) this.f18660;
        mo6517();
        m4637();
        try {
            URL url = new URI(str3).toURL();
            this.f19371.m8505();
            byte[] bArrM5754 = c2533.m5754();
            C3644 c3644 = c5371.f17733;
            C5371.m9020(c3644);
            Map map = c1379.f4726;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                c3644.m6516(new RunnableC1877(this, str2, url, bArrM5754, map, interfaceC2697));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                c3610.f12020.m9434(C3610.m6440(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public boolean m3250() {
        m4637();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C5371) this.f18660).f17739.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: ۥۖ */
    private final void m3247() {
    }

    /* JADX INFO: renamed from: ۦۛ */
    private final void m3248() {
    }
}
