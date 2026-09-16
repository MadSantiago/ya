package p000;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: ۦؔ۟ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3250 implements InterfaceC1463 {

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f10915;

    /* JADX INFO: renamed from: ۦۨ */
    public long f10916;

    public /* synthetic */ C3250(long j, Object obj) {
        this.f10915 = obj;
        this.f10916 = j;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public C4714 m5967() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String strMo2663 = ((InterfaceC4473) this.f10915).mo2663(this.f10916);
            this.f10916 -= (long) strMo2663.length();
            if (strMo2663.length() == 0) {
                return new C4714((String[]) arrayList.toArray(new String[0]));
            }
            int iM1521 = AbstractC0684.m1521(':', 1, 4, strMo2663);
            if (iM1521 != -1) {
                String strSubstring = strMo2663.substring(0, iM1521);
                String strSubstring2 = strMo2663.substring(iM1521 + 1);
                arrayList.add(strSubstring);
                arrayList.add(AbstractC0684.m9760(strSubstring2).toString());
            } else if (strMo2663.charAt(0) == ':') {
                String strSubstring3 = strMo2663.substring(1);
                arrayList.add("");
                arrayList.add(AbstractC0684.m9760(strSubstring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(AbstractC0684.m9760(strMo2663).toString());
            }
        }
    }

    @Override // p000.InterfaceC1463
    /* JADX INFO: renamed from: ۥُ */
    public /* synthetic */ void mo2243(Exception exc) {
        C5460 c5460 = (C5460) this.f10915;
        ((AtomicLong) c5460.f18000).set(this.f10916);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public float m5968(long j) {
        return Float.intBitsToFloat((int) (((EnumC1616) this.f10915) == EnumC1616.f5424 ? j >> 32 : j & 4294967295L));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public long m5969(float f, long j, boolean z) {
        long jM3304;
        long j2 = this.f10916;
        if (z) {
            jM3304 = C1553.m3304(j2, j);
            this.f10916 = jM3304;
        } else {
            jM3304 = C1553.m3304(j2, j);
        }
        if ((((EnumC1616) this.f10915) == null ? C1553.m3303(jM3304) : Math.abs(m5968(jM3304))) < f) {
            return 9205357640488583168L;
        }
        EnumC1616 enumC1616 = (EnumC1616) this.f10915;
        long j3 = this.f10916;
        if (enumC1616 == null) {
            float fM3303 = C1553.m3303(j3);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / fM3303;
            return C1553.m3308(this.f10916, C1553.m3305(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / fM3303)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)));
        }
        float fM5968 = m5968(j3) - (Math.signum(m5968(this.f10916)) * f);
        long j4 = this.f10916;
        EnumC1616 enumC1617 = (EnumC1616) this.f10915;
        EnumC1616 enumC1618 = EnumC1616.f5424;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (enumC1617 == enumC1618 ? j4 & 4294967295L : j4 >> 32));
        if (((EnumC1616) this.f10915) != enumC1618) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fM5968)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM5968)) << 32);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void m5970() {
        C4474 c4474 = (C4474) this.f10915;
        c4474.mo6517();
        ((C5371) c4474.f18660).f17719.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = c4474.m7755().edit();
        editorEdit.remove("health_monitor:count");
        editorEdit.remove("health_monitor:value");
        editorEdit.putLong("health_monitor:start", jCurrentTimeMillis);
        editorEdit.apply();
    }

    public C3250(EnumC1616 enumC1616) {
        this(0L, enumC1616);
    }
}
