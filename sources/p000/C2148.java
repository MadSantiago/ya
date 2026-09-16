package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۥۘؓؒۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2148 implements InterfaceC0103, InterfaceC3717 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f7043;

    /* JADX INFO: renamed from: ۥُ */
    public final String[] f7044;

    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC0103[] f7045;

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC0487 f7046;

    /* JADX INFO: renamed from: ۥۜ */
    public final Map f7047;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f7048;

    /* JADX INFO: renamed from: ۦؑ */
    public final HashSet f7049;

    /* JADX INFO: renamed from: ۦِ */
    public final C2432 f7050;

    /* JADX INFO: renamed from: ۦٛ */
    public final InterfaceC0103[] f7051;

    /* JADX INFO: renamed from: ۦۙ */
    public final List[] f7052;

    public C2148(String str, AbstractC0487 abstractC0487, int i, List list, C1917 c1917) {
        this.f7048 = str;
        this.f7046 = abstractC0487;
        this.f7043 = i;
        ArrayList arrayList = c1917.f6316;
        HashSet hashSet = new HashSet(AbstractC4554.m7911(AbstractC5573.m9402(arrayList, 12)));
        AbstractC0973.m2036(arrayList, hashSet);
        this.f7049 = hashSet;
        int i2 = 0;
        this.f7044 = (String[]) arrayList.toArray(new String[0]);
        this.f7045 = AbstractC0186.m444(c1917.f6318);
        this.f7052 = (List[]) c1917.f6314.toArray(new List[0]);
        ArrayList arrayList2 = c1917.f6315;
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        C2222 c2222 = new C2222(1, new C0101(4, this.f7044));
        ArrayList arrayList3 = new ArrayList(AbstractC5573.m9402(c2222, 10));
        Iterator it2 = c2222.iterator();
        while (true) {
            C0084 c0084 = (C0084) it2;
            if (!((Iterator) c0084.f15890).hasNext()) {
                this.f7047 = AbstractC4554.m7913(arrayList3);
                this.f7051 = AbstractC0186.m444(list);
                this.f7050 = new C2432(new C0463(3, this));
                return;
            }
            C3285 c3285 = (C3285) c0084.next();
            arrayList3.add(new C3869(c3285.f11005, Integer.valueOf(c3285.f11006)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2148) {
            InterfaceC0103 interfaceC0103 = (InterfaceC0103) obj;
            if (this.f7048.equals(interfaceC0103.mo186()) && Arrays.equals(this.f7051, ((C2148) obj).f7051)) {
                int iMo189 = interfaceC0103.mo189();
                int i = this.f7043;
                if (i == iMo189) {
                    for (int i2 = 0; i2 < i; i2++) {
                        InterfaceC0103[] interfaceC0103Arr = this.f7045;
                        if (AbstractC3831.m6874(interfaceC0103Arr[i2].mo186(), interfaceC0103.mo190(i2).mo186()) && AbstractC3831.m6874(interfaceC0103Arr[i2].mo183(), interfaceC0103.mo190(i2).mo183())) {
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
        return C2340.f7777;
    }

    public final int hashCode() {
        return ((Number) this.f7050.getValue()).intValue();
    }

    public final String toString() {
        return AbstractC4593.m7972(this);
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC0487 mo183() {
        return this.f7046;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥُ */
    public final String mo184(int i) {
        return this.f7044[i];
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥۗ */
    public final String mo186() {
        return this.f7048;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo188(String str) {
        Integer num = (Integer) this.f7047.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo189() {
        return this.f7043;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC0103 mo190(int i) {
        return this.f7045[i];
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦٛ */
    public final List mo191(int i) {
        return this.f7052[i];
    }

    @Override // p000.InterfaceC3717
    /* JADX INFO: renamed from: ۦۙ */
    public final Set mo2326() {
        return this.f7049;
    }
}
