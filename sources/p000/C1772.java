package p000;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: renamed from: ۥٛؕؑۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1772 extends AbstractC2758 {

    /* JADX INFO: renamed from: ۥْ */
    public final EnumC4136 f5911;

    public C1772(C0562 c0562, int i, EnumC4136 enumC4136) {
        super(c0562, i);
        this.f5911 = enumC4136;
        StringBuilder sb = new StringBuilder("%");
        c0562.m1264(sb);
        sb.append(true != c0562.m1261() ? 't' : 'T');
        sb.append(enumC4136.f13768);
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥٕ */
    public final void mo3563(C3043 c3043, Object obj) {
        char c = this.f5911.f13768;
        C0562 c0562 = (C0562) this.f9135;
        StringBuilder sb = (StringBuilder) c3043.f10237;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(c).length() + 2);
            sb2.append("%t");
            sb2.append(c);
            C3043.m5645(sb, obj, sb2.toString());
            return;
        }
        StringBuilder sb3 = new StringBuilder("%");
        c0562.m1264(sb3);
        sb3.append(true != c0562.m1261() ? 't' : 'T');
        sb3.append(c);
        sb.append(String.format(AbstractC4935.f16254, sb3.toString(), obj));
    }
}
