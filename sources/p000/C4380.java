package p000;

import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: ۦٜٗؗؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4380 {

    /* JADX INFO: renamed from: ۥؗ */
    public final HashSet f14436;

    /* JADX INFO: renamed from: ۥُ */
    public int f14437;

    /* JADX INFO: renamed from: ۥّ */
    public InterfaceC5346 f14438;

    /* JADX INFO: renamed from: ۥۗ */
    public final HashSet f14439;

    /* JADX INFO: renamed from: ۥۣ */
    public String f14440 = null;

    /* JADX INFO: renamed from: ۦؑ */
    public int f14441;

    /* JADX INFO: renamed from: ۦۙ */
    public final HashSet f14442;

    public C4380(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.f14439 = hashSet;
        this.f14436 = new HashSet();
        this.f14441 = 0;
        this.f14437 = 0;
        this.f14442 = new HashSet();
        hashSet.add(C1166.m2484(cls));
        for (Class cls2 : clsArr) {
            AbstractC1631.m3435(cls2, "Null interface");
            this.f14439.add(C1166.m2484(cls2));
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m7681() {
        if (this.f14441 == 0) {
            this.f14441 = 2;
        } else {
            C1078.m2276("Instantiation type has already been set.");
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C5221 m7682() {
        if (this.f14438 != null) {
            return new C5221(this.f14440, new HashSet(this.f14439), new HashSet(this.f14436), this.f14441, this.f14437, this.f14438, this.f14442);
        }
        C1078.m2276("Missing required property: factory.");
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7683(C0332 c0332) {
        if (this.f14439.contains(c0332.f1242)) {
            C1078.m2272("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.f14436.add(c0332);
        }
    }

    public C4380(C1166 c1166, C1166... c1166Arr) {
        HashSet hashSet = new HashSet();
        this.f14439 = hashSet;
        this.f14436 = new HashSet();
        this.f14441 = 0;
        this.f14437 = 0;
        this.f14442 = new HashSet();
        hashSet.add(c1166);
        for (C1166 c1167 : c1166Arr) {
            AbstractC1631.m3435(c1167, "Null interface");
        }
        Collections.addAll(this.f14439, c1166Arr);
    }
}
