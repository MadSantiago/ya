package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۦٜؕؒۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C4688 implements InterfaceC0103, InterfaceC3717 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f15432;

    /* JADX INFO: renamed from: ۥُ */
    public final String[] f15433;

    /* JADX INFO: renamed from: ۥّ */
    public final List[] f15434;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC1441 f15435;

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean[] f15436;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f15437;

    /* JADX INFO: renamed from: ۦؑ */
    public int f15438 = -1;

    /* JADX INFO: renamed from: ۦؚ */
    public final InterfaceC5130 f15439;

    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC5130 f15440;

    /* JADX INFO: renamed from: ۦٛ */
    public Map f15441;

    /* JADX INFO: renamed from: ۦۗ */
    public final InterfaceC5130 f15442;

    /* JADX INFO: renamed from: ۦۙ */
    public ArrayList f15443;

    public C4688(String str, InterfaceC1441 interfaceC1441, int i) {
        this.f15437 = str;
        this.f15435 = interfaceC1441;
        this.f15432 = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.f15433 = strArr;
        int i4 = this.f15432;
        this.f15434 = new List[i4];
        this.f15436 = new boolean[i4];
        this.f15441 = C0204.f751;
        InterfaceC4448 interfaceC4448 = new InterfaceC4448(this) { // from class: ۦۡؗۢٔ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C4688 f18161;

            {
                this.f18161 = this;
            }

            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i5 = i2;
                C4688 c4688 = this.f18161;
                switch (i5) {
                    case 0:
                        InterfaceC1441 interfaceC1442 = c4688.f15435;
                        return interfaceC1442 != null ? interfaceC1442.mo404() : AbstractC1434.f4916;
                    case 1:
                        return AbstractC0186.m444(c4688.f15435 != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(AbstractC4593.m7967(c4688, (InterfaceC0103[]) c4688.f15442.getValue()));
                }
            }
        };
        final int i5 = 2;
        this.f15440 = AbstractC3933.m7095(2, interfaceC4448);
        final int i6 = 1;
        this.f15442 = AbstractC3933.m7095(2, new InterfaceC4448(this) { // from class: ۦۡؗۢٔ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C4688 f18161;

            {
                this.f18161 = this;
            }

            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i7 = i6;
                C4688 c4688 = this.f18161;
                switch (i7) {
                    case 0:
                        InterfaceC1441 interfaceC1442 = c4688.f15435;
                        return interfaceC1442 != null ? interfaceC1442.mo404() : AbstractC1434.f4916;
                    case 1:
                        return AbstractC0186.m444(c4688.f15435 != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(AbstractC4593.m7967(c4688, (InterfaceC0103[]) c4688.f15442.getValue()));
                }
            }
        });
        this.f15439 = AbstractC3933.m7095(2, new InterfaceC4448(this) { // from class: ۦۡؗۢٔ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C4688 f18161;

            {
                this.f18161 = this;
            }

            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i7 = i5;
                C4688 c4688 = this.f18161;
                switch (i7) {
                    case 0:
                        InterfaceC1441 interfaceC1442 = c4688.f15435;
                        return interfaceC1442 != null ? interfaceC1442.mo404() : AbstractC1434.f4916;
                    case 1:
                        return AbstractC0186.m444(c4688.f15435 != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(AbstractC4593.m7967(c4688, (InterfaceC0103[]) c4688.f15442.getValue()));
                }
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4688) {
            InterfaceC0103 interfaceC0103 = (InterfaceC0103) obj;
            if (this.f15437.equals(interfaceC0103.mo186()) && Arrays.equals((InterfaceC0103[]) this.f15442.getValue(), (InterfaceC0103[]) ((C4688) obj).f15442.getValue())) {
                int iMo189 = interfaceC0103.mo189();
                int i = this.f15432;
                if (i == iMo189) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (AbstractC3831.m6874(mo190(i2).mo186(), interfaceC0103.mo190(i2).mo186()) && AbstractC3831.m6874(mo190(i2).mo183(), interfaceC0103.mo190(i2).mo183())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0103
    public final List getAnnotations() {
        ArrayList arrayList = this.f15443;
        return arrayList == null ? C2340.f7777 : arrayList;
    }

    public int hashCode() {
        return ((Number) this.f15439.getValue()).intValue();
    }

    public String toString() {
        return AbstractC4593.m7972(this);
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥؗ */
    public AbstractC0487 mo183() {
        return C3626.f12098;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥُ */
    public final String mo184(int i) {
        return this.f15433[i];
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥۗ */
    public final String mo186() {
        return this.f15437;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo188(String str) {
        Integer num = (Integer) this.f15441.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo189() {
        return this.f15432;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦِ */
    public InterfaceC0103 mo190(int i) {
        return ((InterfaceC4734[]) this.f15440.getValue())[i].mo193();
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦٛ */
    public final List mo191(int i) {
        List list = this.f15434[i];
        return list == null ? C2340.f7777 : list;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m8034(String str, boolean z) {
        int i = this.f15438 + 1;
        this.f15438 = i;
        String[] strArr = this.f15433;
        strArr[i] = str;
        this.f15436[i] = z;
        this.f15434[i] = null;
        if (i == this.f15432 - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.f15441 = map;
        }
    }

    @Override // p000.InterfaceC3717
    /* JADX INFO: renamed from: ۦۙ */
    public final Set mo2326() {
        return this.f15441.keySet();
    }
}
