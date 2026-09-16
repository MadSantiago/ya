package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦِۢؗٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5556 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1249 f18338 = new C1249("");

    /* JADX INFO: renamed from: ۥۗ */
    public static final boolean m9310(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final List m9311(C1249 c1249, int i, int i2, C0086 c0086) {
        List list;
        if (i == i2 || (list = c1249.f4308) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= c1249.f4307.length()) {
            if (c0086 == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) c0086.mo211(((C2331) obj).f7719)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            C2331 c2331 = (C2331) list.get(i3);
            if (c0086 != null ? ((Boolean) c0086.mo211(c2331.f7719)).booleanValue() : true) {
                int i4 = c2331.f7718;
                int i5 = c2331.f7717;
                if (m9310(i, i2, i4, i5)) {
                    arrayList2.add(new C2331(AbstractC4554.m7934(c2331.f7718, i, i2) - i, AbstractC4554.m7934(i5, i, i2) - i, (InterfaceC1116) c2331.f7719, c2331.f7720));
                }
            }
            i3++;
        }
        return arrayList2;
    }
}
