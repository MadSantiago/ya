package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: ۦٌۛؒ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5221 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Set f17236;

    /* JADX INFO: renamed from: ۥُ */
    public final int f17237;

    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC5346 f17238;

    /* JADX INFO: renamed from: ۥۗ */
    public final Set f17239;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f17240;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f17241;

    /* JADX INFO: renamed from: ۦۙ */
    public final Set f17242;

    public C5221(String str, Set set, Set set2, int i, int i2, InterfaceC5346 interfaceC5346, Set set3) {
        this.f17240 = str;
        this.f17239 = Collections.unmodifiableSet(set);
        this.f17236 = Collections.unmodifiableSet(set2);
        this.f17241 = i;
        this.f17237 = i2;
        this.f17238 = interfaceC5346;
        this.f17242 = Collections.unmodifiableSet(set3);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C5221 m8846(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C1166.m2484(cls));
        for (Class cls2 : clsArr) {
            AbstractC1631.m3435(cls2, "Null interface");
            hashSet.add(C1166.m2484(cls2));
        }
        return new C5221(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C1639(1, obj), hashSet3);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C4380 m8847(Class cls) {
        return new C4380(cls, new Class[0]);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C4380 m8848(C1166 c1166) {
        return new C4380(c1166, new C1166[0]);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f17239.toArray()) + ">{" + this.f17241 + ", type=" + this.f17237 + ", deps=" + Arrays.toString(this.f17236.toArray()) + "}";
    }
}
