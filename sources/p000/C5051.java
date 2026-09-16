package p000;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦُۣۘؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5051 implements Comparable {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final String f16766 = File.separator;

    /* JADX INFO: renamed from: ۦۨ */
    public final C1007 f16767;

    public C5051(C1007 c1007) {
        this.f16767 = c1007;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f16767.compareTo(((C5051) obj).f16767);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5051) && AbstractC3831.m6874(((C5051) obj).f16767, this.f16767);
    }

    public final int hashCode() {
        return this.f16767.hashCode();
    }

    public final File toFile() {
        return new File(this.f16767.m2214());
    }

    public final String toString() {
        return this.f16767.m2214();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C5051 m8569(C5051 c5051) {
        C1007 c1007 = c5051.f16767;
        int iM8662 = AbstractC0088.m8662(this);
        C1007 c1008 = this.f16767;
        C5051 c5052 = iM8662 == -1 ? null : new C5051(c1008.mo2212(0, iM8662));
        int iM8663 = AbstractC0088.m8662(c5051);
        if (!AbstractC3831.m6874(c5052, iM8663 == -1 ? null : new C5051(c1007.mo2212(0, iM8663)))) {
            C0178.m392("Paths of different roots cannot be relative to each other: ", this, " and ", c5051);
            return null;
        }
        ArrayList arrayListM8572 = m8572();
        ArrayList arrayListM8573 = c5051.m8572();
        int iMin = Math.min(arrayListM8572.size(), arrayListM8573.size());
        int i = 0;
        while (i < iMin && AbstractC3831.m6874(arrayListM8572.get(i), arrayListM8573.get(i))) {
            i++;
        }
        if (i == iMin && c1008.mo2205() == c1007.mo2205()) {
            return C4992.m8381(".");
        }
        if (arrayListM8573.subList(i, arrayListM8573.size()).indexOf(AbstractC0088.f16841) != -1) {
            C0178.m392("Impossible relative path to resolve: ", this, " and ", c5051);
            return null;
        }
        C1270 c1270 = new C1270();
        C1007 c1007M8665 = AbstractC0088.m8665(c5051);
        if (c1007M8665 == null && (c1007M8665 = AbstractC0088.m8665(this)) == null) {
            c1007M8665 = AbstractC0088.m8664(f16766);
        }
        int size = arrayListM8573.size();
        for (int i2 = i; i2 < size; i2++) {
            c1270.m2676(AbstractC0088.f16841);
            c1270.m2676(c1007M8665);
        }
        int size2 = arrayListM8572.size();
        while (i < size2) {
            c1270.m2676((C1007) arrayListM8572.get(i));
            c1270.m2676(c1007M8665);
            i++;
        }
        return AbstractC0088.m8667(c1270, false);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final Character m8570() {
        C1007 c1007 = AbstractC0088.f16843;
        C1007 c1008 = this.f16767;
        if (C1007.m2201(c1008, c1007) != -1 || c1008.mo2205() < 2 || c1008.mo2213(1) != 58) {
            return null;
        }
        char cMo2213 = (char) c1008.mo2213(0);
        if (('a' > cMo2213 || cMo2213 >= '{') && ('A' > cMo2213 || cMo2213 >= '[')) {
            return null;
        }
        return Character.valueOf(cMo2213);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C5051 m8571() {
        C1007 c1007 = AbstractC0088.f16844;
        C1007 c1008 = this.f16767;
        if (AbstractC3831.m6874(c1008, c1007)) {
            return null;
        }
        C1007 c1009 = AbstractC0088.f16843;
        if (AbstractC3831.m6874(c1008, c1009)) {
            return null;
        }
        C1007 c10010 = AbstractC0088.f16842;
        if (AbstractC3831.m6874(c1008, c10010)) {
            return null;
        }
        C1007 c10011 = AbstractC0088.f16841;
        int iMo2205 = c1008.mo2205();
        byte[] bArr = c10011.f3598;
        if (c1008.mo2211(iMo2205 - bArr.length, c10011, bArr.length) && (c1008.mo2205() == 2 || c1008.mo2211(c1008.mo2205() - 3, c1009, 1) || c1008.mo2211(c1008.mo2205() - 3, c10010, 1))) {
            return null;
        }
        c1008.getClass();
        int iMo2206 = c1008.mo2206(c1009.mo2204());
        if (iMo2206 == -1) {
            c1008.getClass();
            iMo2206 = c1008.mo2206(c10010.mo2204());
        }
        if (iMo2206 == 2 && m8570() != null) {
            if (c1008.mo2205() == 3) {
                return null;
            }
            return new C5051(C1007.m2202(c1008, 0, 3, 1));
        }
        if (iMo2206 == 1 && c1008.mo2211(0, c10010, c10010.mo2205())) {
            return null;
        }
        if (iMo2206 != -1 || m8570() == null) {
            if (iMo2206 == -1) {
                return new C5051(c1007);
            }
            return iMo2206 == 0 ? new C5051(C1007.m2202(c1008, 0, 1, 1)) : new C5051(C1007.m2202(c1008, 0, iMo2206, 1));
        }
        if (c1008.mo2205() == 2) {
            return null;
        }
        return new C5051(C1007.m2202(c1008, 0, 2, 1));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final ArrayList m8572() {
        ArrayList arrayList = new ArrayList();
        int iM8662 = AbstractC0088.m8662(this);
        C1007 c1007 = this.f16767;
        if (iM8662 == -1) {
            iM8662 = 0;
        } else if (iM8662 < c1007.mo2205() && c1007.mo2213(iM8662) == 92) {
            iM8662++;
        }
        int iMo2205 = c1007.mo2205();
        int i = iM8662;
        while (iM8662 < iMo2205) {
            if (c1007.mo2213(iM8662) == 47 || c1007.mo2213(iM8662) == 92) {
                arrayList.add(c1007.mo2212(i, iM8662));
                i = iM8662 + 1;
            }
            iM8662++;
        }
        if (i < c1007.mo2205()) {
            arrayList.add(c1007.mo2212(i, c1007.mo2205()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C5051 m8573(String str) {
        C1270 c1270 = new C1270();
        c1270.m2677(str);
        return AbstractC0088.m8666(this, AbstractC0088.m8667(c1270, false), false);
    }
}
