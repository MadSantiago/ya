package p000;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: renamed from: ۦَّؓؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3148 implements Runnable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5235 f10622;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10623;

    public /* synthetic */ RunnableC3148(C5235 c5235, int i) {
        this.f10623 = i;
        this.f10622 = c5235;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10623;
        C5235 c5235 = this.f10622;
        switch (i) {
            case 0:
                c5235.m8884();
                break;
            case 1:
                C3743 c3743 = c5235.f17273;
                C5371 c5371 = (C5371) c3743.f12466;
                C3644 c3644 = c5371.f17733;
                C5235 c5236 = c5371.f17709;
                C4474 c4474 = c5371.f17713;
                C5371.m9020(c3644);
                c3644.mo6517();
                if (c3743.m6586()) {
                    if (c3743.m6582()) {
                        C5371.m9021(c4474);
                        c4474.f14768.m2971(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        C5371.m9023(c5236);
                        c5236.m8879("auto", "_cmpx", bundle);
                    } else {
                        C5371.m9021(c4474);
                        C1405 c1405 = c4474.f14768;
                        String strM2974 = c1405.m2974();
                        if (TextUtils.isEmpty(strM2974)) {
                            C3610 c3610 = c5371.f17717;
                            C5371.m9020(c3610);
                            c3610.f12025.m9432("Cache still valid but referrer not found");
                        } else {
                            long j = 3600000;
                            long jM7371 = c4474.f14770.m7371() / 3600000;
                            Uri uri = Uri.parse(strM2974);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                                j = j;
                            }
                            ((Bundle) pair.second).putLong("_cc", (jM7371 - 1) * j);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            C5371.m9023(c5236);
                            c5236.m8879(str2, "_cmp", (Bundle) pair.second);
                        }
                        c1405.m2971(null);
                    }
                    C5371.m9021(c4474);
                    c4474.f14770.m7370(0L);
                    break;
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                c5235.mo6517();
                C5371 c5372 = (C5371) c5235.f18660;
                C4474 c4475 = c5372.f17713;
                C3610 c3611 = c5372.f17717;
                C5371.m9021(c4475);
                C4797 c4797 = c4475.f14765;
                if (c4797.m8175()) {
                    C5371.m9020(c3611);
                    c3611.f12015.m9432("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    C4173 c4173 = c4475.f14763;
                    long jM7372 = c4173.m7371();
                    c4173.m7370(1 + jM7372);
                    if (jM7372 >= 5) {
                        C5371.m9020(c3611);
                        c3611.f12022.m9432("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        c4797.m8174(true);
                    } else {
                        C0826 c0826 = c5235.f17282;
                        if (c0826 == null) {
                            c0826 = new C0826(c5235, c5372, 3, false);
                            c5235.f17282 = c0826;
                        }
                        c0826.m2199(0L);
                    }
                }
                break;
            default:
                c5235.m8884();
                break;
        }
    }
}
