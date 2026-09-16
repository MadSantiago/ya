package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥًٓؑۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1249 implements CharSequence {

    /* JADX INFO: renamed from: ۥْ */
    public final ArrayList f4305;

    /* JADX INFO: renamed from: ۥٓ */
    public final ArrayList f4306;

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f4307;

    /* JADX INFO: renamed from: ۦۨ */
    public final List f4308;

    static {
        C2346 c2346 = AbstractC0539.f1919;
    }

    public C1249(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f4308 = list;
        this.f4307 = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                C2331 c2331 = (C2331) list.get(i);
                Object obj = c2331.f7719;
                if (obj instanceof C0553) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c2331);
                } else if (obj instanceof C0477) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c2331);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f4305 = arrayList;
        this.f4306 = arrayList2;
        List listM2055 = arrayList2 != null ? AbstractC0973.m2055(arrayList2, new C1206(5)) : null;
        if (listM2055 == null || listM2055.isEmpty()) {
            return;
        }
        int i2 = ((C2331) AbstractC0973.m2045(listM2055)).f7717;
        C4523 c4523 = AbstractC0549.f1967;
        C4523 c4524 = new C4523(1);
        c4524.m7843(i2);
        int size2 = listM2055.size();
        for (int i3 = 1; i3 < size2; i3++) {
            C2331 c2332 = (C2331) listM2055.get(i3);
            while (true) {
                int i4 = c4524.f14948;
                if (i4 == 0) {
                    break;
                }
                if (i4 == 0) {
                    C0178.m384("IntList is empty.");
                    throw null;
                }
                int i5 = c4524.f14949[i4 - 1];
                int i6 = c2332.f7718;
                int i7 = c2332.f7717;
                if (i6 < i5) {
                    if (i7 > i5) {
                        AbstractC3767.m6644("Paragraph overlap not allowed, end " + i7 + " should be less than or equal to " + i5);
                        break;
                    }
                    break;
                }
                c4524.m7844(i4 - 1);
            }
            c4524.m7843(c2332.f7717);
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f4307.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1249)) {
            return false;
        }
        C1249 c1249 = (C1249) obj;
        return AbstractC3831.m6874(this.f4307, c1249.f4307) && AbstractC3831.m6874(this.f4308, c1249.f4308);
    }

    public final int hashCode() {
        int iHashCode = this.f4307.hashCode() * 31;
        List list = this.f4308;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4307.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f4307;
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: ۥؗ, reason: merged with bridge method [inline-methods] */
    public final C1249 subSequence(int i, int i2) {
        if (!(i <= i2)) {
            AbstractC3767.m6644("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.f4307;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        C1249 c1249 = AbstractC5556.f18338;
        if (i > i2) {
            AbstractC3767.m6644("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.f4308;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C2331 c2331 = (C2331) list.get(i3);
                int i4 = c2331.f7718;
                int i5 = c2331.f7717;
                if (AbstractC5556.m9310(i, i2, i4, i5)) {
                    arrayList2.add(new C2331(Math.max(i, c2331.f7718) - i, Math.min(i2, i5) - i, c2331.f7719, c2331.f7720));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new C1249(arrayList, strSubstring);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C1249 m2637(InterfaceC4745 interfaceC4745) {
        C4042 c4042 = new C4042(this);
        ArrayList arrayList = c4042.f13481;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2331 c2331 = (C2331) interfaceC4745.mo211(((C2181) arrayList.get(i)).m4236(Integer.MIN_VALUE));
            arrayList.set(i, new C2181(c2331.f7718, c2331.f7717, c2331.f7719, c2331.f7720));
        }
        return c4042.m7241();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final List m2638(int i) {
        List list = this.f4308;
        if (list == null) {
            return C2340.f7777;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            C2331 c2331 = (C2331) obj;
            if ((c2331.f7719 instanceof AbstractC4428) && AbstractC5556.m9310(0, i, c2331.f7718, c2331.f7717)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public /* synthetic */ C1249(String str) {
        this(str, C2340.f7777);
    }

    public C1249(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
