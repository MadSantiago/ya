package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: ۦۘؒۙؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5008 {

    /* JADX INFO: renamed from: ۥۣ */
    public final HashMap f16580;

    public C5008(int i) {
        switch (i) {
            case 1:
                this.f16580 = new HashMap();
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                this.f16580 = new HashMap();
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                this.f16580 = new HashMap(3);
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                this.f16580 = new HashMap();
                break;
            default:
                this.f16580 = new HashMap(3);
                break;
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void m8422(Class cls, InterfaceC1652 interfaceC1652) {
        this.f16580.put(cls, interfaceC1652);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m8423(C0220 c0220, Object obj) {
        HashMap map = this.f16580;
        if (obj == null) {
            map.remove(c0220);
        } else {
            map.put(c0220, obj);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m8424(Class cls, InterfaceC2059 interfaceC2059) {
        this.f16580.put(cls, interfaceC2059);
    }
}
