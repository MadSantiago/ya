package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ۦؙٗؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4388 {

    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ C4681 f14460;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC4388[] f14462;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3545 f14464;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC4388 f14463 = new EnumC4388(new C4441(new long[]{8764036336949167849L, -218524809361479138L, -3084696305012648092L, 3707157945569162517L}).toString(), 0, C4463.f14715.m7320(C4463.f14717));

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC4388 f14461 = new EnumC4388(new C4441(new long[]{4813216740702115670L, 671652519662148441L, -5848076867688196004L, -2127063959648664523L}).toString(), 1, C0906.f3254.m7320(C0906.f3256));

    static {
        String string = new C4441(new long[]{-4138538435795818810L, 3855854143301734798L, -1824934153444597946L, 6261771572652538774L}).toString();
        C1088.f3797.getClass();
        String[] strArr = C1088.f3799;
        C3545 c3545 = new C3545();
        c3545.f11777 = C1088.f3801;
        List listM509 = AbstractC0246.m509(strArr);
        ArrayList arrayList = new ArrayList(AbstractC5573.m9402(listM509, 10));
        Iterator it = listM509.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2203(5, (String) it.next(), false));
        }
        c3545.f11776 = new ArrayList(arrayList);
        EnumC4388[] enumC4388Arr = {f14463, f14461, new EnumC4388(string, 2, c3545), new EnumC4388(new C4441(new long[]{-4863508309562570279L, -8404310000136782434L, 8830207755682160479L}).toString(), 3, C5026.f16637.m7320(C5026.f16639)), new EnumC4388(new C4441(new long[]{-9043230458027506393L, 4519622650298881820L, 3724543930424586106L}).toString(), 4, C5677.f18661.m7320(C5677.f18663))};
        f14462 = enumC4388Arr;
        f14460 = new C4681(enumC4388Arr);
    }

    public EnumC4388(String str, int i, C3545 c3545) {
        super(str, i);
        this.f14464 = c3545;
    }

    public static EnumC4388 valueOf(String str) {
        return (EnumC4388) Enum.valueOf(EnumC4388.class, str);
    }

    public static EnumC4388[] values() {
        return (EnumC4388[]) f14462.clone();
    }
}
