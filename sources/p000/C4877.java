package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۦًؘٟٖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4877 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C4229 f16039;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16040;

    public /* synthetic */ C4877(C4229 c4229, int i) {
        this.f16040 = i;
        this.f16039 = c4229;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f16040;
        C4229 c4229 = this.f16039;
        switch (i) {
            case 0:
                C3657 c3657 = new C3657((Method) ((Member) obj));
                Object obj2 = c4229.f14029;
                if (obj2 != null) {
                    c3657.mo3716(obj2);
                }
                return c3657;
            case 1:
                C1177 c1177 = new C1177((Constructor) ((Member) obj));
                Object obj3 = c4229.f14029;
                return c1177;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C1865 c1865 = new C1865((Field) ((Member) obj));
                Object obj4 = c4229.f14029;
                if (obj4 != null) {
                    c1865.mo3716(obj4);
                }
                return c1865;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C3657 c3658 = new C3657((Method) ((Member) obj));
                Object obj5 = c4229.f14029;
                if (obj5 != null) {
                    c3658.mo3716(obj5);
                }
                return c3658;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C1177 c1178 = new C1177((Constructor) ((Member) obj));
                Object obj6 = c4229.f14029;
                return c1178;
            default:
                C1865 c1866 = new C1865((Field) ((Member) obj));
                Object obj7 = c4229.f14029;
                if (obj7 != null) {
                    c1866.mo3716(obj7);
                }
                return c1866;
        }
    }
}
