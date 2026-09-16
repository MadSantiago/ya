package p000;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: ۦٌۜؒ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5272 extends AbstractC2474 {

    /* JADX INFO: renamed from: ۥَ */
    public final C4173 f17370;

    /* JADX INFO: renamed from: ۥٓ */
    public final HashMap f17371;

    /* JADX INFO: renamed from: ۥٖ */
    public final C4173 f17372;

    /* JADX INFO: renamed from: ۥۖ */
    public final C4173 f17373;

    /* JADX INFO: renamed from: ۦٕ */
    public final C4173 f17374;

    /* JADX INFO: renamed from: ۦٗ */
    public final C4173 f17375;

    /* JADX INFO: renamed from: ۦۛ */
    public final C4173 f17376;

    public C5272(C5034 c5034) {
        super(c5034);
        this.f17371 = new HashMap();
        C4474 c4474 = ((C5371) this.f18660).f17713;
        C5371.m9021(c4474);
        this.f17370 = new C4173(c4474, "last_delete_stale", 0L);
        C4474 c4475 = ((C5371) this.f18660).f17713;
        C5371.m9021(c4475);
        this.f17372 = new C4173(c4475, "last_delete_stale_batch", 0L);
        C4474 c4476 = ((C5371) this.f18660).f17713;
        C5371.m9021(c4476);
        this.f17375 = new C4173(c4476, "backoff", 0L);
        C4474 c4477 = ((C5371) this.f18660).f17713;
        C5371.m9021(c4477);
        this.f17376 = new C4173(c4477, "last_upload", 0L);
        C4474 c4478 = ((C5371) this.f18660).f17713;
        C5371.m9021(c4478);
        this.f17373 = new C4173(c4478, "last_upload_attempt", 0L);
        C4474 c4479 = ((C5371) this.f18660).f17713;
        C5371.m9021(c4479);
        this.f17374 = new C4173(c4479, "midnight_offset", 0L);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final String m8904(C5855 c5855, C5211 c5211) {
        String str = c5855.f19339;
        AbstractC0487.m1090(str);
        if (!c5211.m8815(EnumC4635.f15302) || !c5855.f19325) {
            return "";
        }
        mo6517();
        String str2 = (String) m8906(str).first;
        MessageDigest messageDigestM3194 = C1512.m3194();
        if (messageDigestM3194 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM3194.digest(str2.getBytes())));
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final Pair m8905(C5855 c5855, C5211 c5211) {
        String str = c5855.f19339;
        AbstractC0487.m1090(str);
        return (c5211.m8815(EnumC4635.f15302) && c5855.f19325) ? m8906(str) : new Pair("", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final Pair m8906(String str) {
        C5286 c5286;
        C0946 c0946M8546;
        mo6517();
        C5371 c5371 = (C5371) this.f18660;
        C1397 c1397 = c5371.f17719;
        C0515 c0515 = c5371.f17715;
        c1397.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f17371;
        C5286 c5287 = (C5286) map.get(str);
        if (c5287 != null && jElapsedRealtime < c5287.f17416) {
            return new Pair(c5287.f17418, Boolean.valueOf(c5287.f17417));
        }
        long jM1159 = c0515.m1159(str, AbstractC4936.f16289) + jElapsedRealtime;
        try {
            try {
                c0946M8546 = C5037.m8546(c5371.f17739);
            } catch (PackageManager.NameNotFoundException unused) {
                if (c5287 != null && jElapsedRealtime < c5287.f17416 + c0515.m1159(str, AbstractC4936.f16263)) {
                    return new Pair(c5287.f17418, Boolean.valueOf(c5287.f17417));
                }
                c0946M8546 = null;
            }
            if (c0946M8546 == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = c0946M8546.f3351;
            c5286 = str2 != null ? new C5286(jM1159, str2, c0946M8546.f3352) : new C5286(jM1159, "", c0946M8546.f3352);
            map.put(str, c5286);
            return new Pair(c5286.f17418, Boolean.valueOf(c5286.f17417));
        } catch (Exception e) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12015.m9430(e, "Unable to get advertising id");
            c5286 = new C5286(jM1159, "", false);
        }
    }

    @Override // p000.AbstractC2474
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo2428() {
    }
}
