package p000;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: ۦؑؑۦۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3020 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final HashMap f10168;

    /* JADX INFO: renamed from: ۥۣ */
    public static final SparseArray f10169 = new SparseArray();

    static {
        HashMap map = new HashMap();
        f10168 = map;
        map.put(EnumC4021.f13412, 0);
        map.put(EnumC4021.f13411, 1);
        map.put(EnumC4021.f13409, 2);
        for (EnumC4021 enumC4021 : map.keySet()) {
            f10169.append(((Integer) f10168.get(enumC4021)).intValue(), enumC4021);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static EnumC4021 m5613(int i) {
        EnumC4021 enumC4021 = (EnumC4021) f10169.get(i);
        if (enumC4021 != null) {
            return enumC4021;
        }
        C1078.m2272(AbstractC5078.m8670(i, "Unknown Priority for value "));
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static int m5614(EnumC4021 enumC4021) {
        Integer num = (Integer) f10168.get(enumC4021);
        if (num != null) {
            return num.intValue();
        }
        C0178.m390(enumC4021, "PriorityMapping is missing known Priority value ");
        return 0;
    }
}
