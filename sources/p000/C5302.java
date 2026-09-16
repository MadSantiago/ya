package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦۜؗۘۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5302 extends AbstractC1127 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public static final C5302 f17461;

    /* JADX INFO: renamed from: ۥْ */
    public static final C5302 f17462;

    /* JADX INFO: renamed from: ۥٓ */
    public static final C5302 f17463;

    /* JADX INFO: renamed from: ۥٖ */
    public static final C5302 f17464;

    /* JADX INFO: renamed from: ۥۖ */
    public static final C5302 f17465;

    /* JADX INFO: renamed from: ۦٕ */
    public static final C5302 f17466;

    /* JADX INFO: renamed from: ۦٗ */
    public static final C5302 f17467;

    /* JADX INFO: renamed from: ۦۛ */
    public static final C5302 f17468;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f17469;

    static {
        int i = 2;
        f17462 = new C5302(i, 0);
        f17463 = new C5302(i, 1);
        f17461 = new C5302(i, 2);
        f17464 = new C5302(i, 3);
        f17467 = new C5302(i, 4);
        f17468 = new C5302(i, 5);
        f17465 = new C5302(i, 6);
        f17466 = new C5302(i, 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5302(int i, int i2) {
        super(i);
        this.f17469 = i2;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        String str;
        InterfaceC0400 interfaceC0400;
        switch (this.f17469) {
            case 0:
                return (String) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return (String) obj;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C0078 c0078 = (C0078) obj;
                C0078 c0079 = (C0078) obj2;
                if (c0078 == null || (str = c0078.f14721) == null) {
                    str = c0079.f14721;
                }
                if (c0078 == null || (interfaceC0400 = c0078.f14720) == null) {
                    interfaceC0400 = c0079.f14720;
                }
                return new C0078(str, interfaceC0400);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return obj == null ? obj2 : obj;
            default:
                C3129 c3129 = (C3129) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                C2542 c2542 = ((C3129) obj).f10476;
                C3059 c3059 = AbstractC2771.f9226;
                Object objM6027 = c2542.f8490.m6027(c3059);
                if (objM6027 == null) {
                    objM6027 = objValueOf;
                }
                float fFloatValue = ((Number) objM6027).floatValue();
                Object objM6028 = c3129.f10476.f8490.m6027(c3059);
                if (objM6028 != null) {
                    objValueOf = objM6028;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
