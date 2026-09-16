package p000;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥٜٖؕٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1832 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f6089;

    /* JADX INFO: renamed from: ۥُ */
    public final long f6090;

    /* JADX INFO: renamed from: ۥّ */
    public final long f6091;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f6092;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f6093;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f6094;

    /* JADX INFO: renamed from: ۦۙ */
    public final C5645 f6095;

    public C1832(C5371 c5371, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        C5645 c5645;
        AbstractC0487.m1090(str2);
        AbstractC0487.m1090(str3);
        this.f6093 = str2;
        this.f6092 = str3;
        this.f6089 = true == TextUtils.isEmpty(str) ? null : str;
        this.f6094 = j;
        this.f6090 = j2;
        this.f6091 = j3;
        if (j3 != 0 && j3 > j) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9430(C3610.m6440(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            c5645 = new C5645(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    C3610 c3611 = c5371.f17717;
                    C5371.m9020(c3611);
                    c3611.f12020.m9432("Param name can't be null");
                    it.remove();
                } else {
                    C1512 c1512 = c5371.f17721;
                    C5371.m9021(c1512);
                    Object objM3204 = c1512.m3204(bundle2.get(next), next);
                    if (objM3204 == null) {
                        C3610 c3612 = c5371.f17717;
                        C5371.m9020(c3612);
                        c3612.f12022.m9430(c5371.f17731.m7145(next), "Param value can't be null");
                        it.remove();
                    } else {
                        C1512 c1513 = c5371.f17721;
                        C5371.m9021(c1513);
                        c1513.m3231(bundle2, next, objM3204);
                    }
                }
            }
            c5645 = new C5645(bundle2);
        }
        this.f6095 = c5645;
    }

    public final String toString() {
        String string = this.f6095.f18597.toString();
        String str = this.f6093;
        int length = String.valueOf(str).length();
        String str2 = this.f6092;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        return AbstractC3761.m6622(sb, "', params=", string, "}");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C1832 m3602(C5371 c5371, long j) {
        return new C1832(c5371, this.f6089, this.f6093, this.f6092, this.f6094, this.f6090, j, this.f6095);
    }

    public C1832(C5371 c5371, String str, String str2, String str3, long j, long j2, long j3, C5645 c5645) {
        AbstractC0487.m1090(str2);
        AbstractC0487.m1090(str3);
        this.f6093 = str2;
        this.f6092 = str3;
        this.f6089 = true == TextUtils.isEmpty(str) ? null : str;
        this.f6094 = j;
        this.f6090 = j2;
        this.f6091 = j3;
        if (j3 != 0 && j3 > j) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9434(C3610.m6440(str2), C3610.m6440(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f6095 = c5645;
    }
}
