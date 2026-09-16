package p000;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: renamed from: ۥٔؖۛۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1357 extends AbstractC1127 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f4664;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f4665;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f4666;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ Serializable f4667;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f4668 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1357(C3963 c3963, InterfaceC0705 interfaceC0705, InterfaceC0215 interfaceC0215, String str, int i) {
        super(2);
        this.f4665 = c3963;
        this.f4666 = interfaceC0705;
        this.f4664 = interfaceC0215;
        this.f4667 = str;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) throws IOException {
        int i = this.f4668;
        C2358 c2358 = C2358.f7817;
        Serializable serializable = this.f4667;
        Object obj3 = this.f4664;
        Object obj4 = this.f4666;
        Object obj5 = this.f4665;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC3925.m7041((C3963) obj5, (InterfaceC0705) obj4, (InterfaceC0215) obj3, (String) serializable, (C5362) obj, AbstractC3831.m6835(27649));
                return c2358;
            default:
                int iIntValue = ((Number) obj).intValue();
                long jLongValue = ((Number) obj2).longValue();
                C4162 c4162 = (C4162) obj5;
                if (iIntValue != 21589) {
                    return c2358;
                }
                if (jLongValue >= 1) {
                    byte b = c4162.readByte();
                    boolean z = (b & 1) == 1;
                    boolean z2 = (b & 2) == 2;
                    boolean z3 = (b & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (jLongValue >= j) {
                        if (z) {
                            ((C5450) obj4).f17965 = Long.valueOf(((long) c4162.m7363()) * 1000);
                        }
                        if (z2) {
                            ((C5450) obj3).f17965 = Long.valueOf(((long) c4162.m7363()) * 1000);
                        }
                        if (!z3) {
                            return c2358;
                        }
                        ((C5450) serializable).f17965 = Long.valueOf(((long) c4162.m7363()) * 1000);
                        return c2358;
                    }
                    C5028.m8448("bad zip: extended timestamp extra too short");
                } else {
                    C5028.m8448("bad zip: extended timestamp extra too short");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1357(C4162 c4162, C5450 c5450, C5450 c5451, C5450 c5452) {
        super(2);
        this.f4665 = c4162;
        this.f4666 = c5450;
        this.f4664 = c5451;
        this.f4667 = c5452;
    }
}
