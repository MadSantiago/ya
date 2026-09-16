package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥۥؑ٘ٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2715 extends AbstractC1090 implements Iterable, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥَ */
    public final float f8996;

    /* JADX INFO: renamed from: ۥْ */
    public final float f8997;

    /* JADX INFO: renamed from: ۥٓ */
    public final float f8998;

    /* JADX INFO: renamed from: ۥٖ */
    public final float f8999;

    /* JADX INFO: renamed from: ۥۖ */
    public final List f9000;

    /* JADX INFO: renamed from: ۦٕ */
    public final ArrayList f9001;

    /* JADX INFO: renamed from: ۦٗ */
    public final float f9002;

    /* JADX INFO: renamed from: ۦۛ */
    public final float f9003;

    /* JADX INFO: renamed from: ۦ۟ */
    public final float f9004;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f9005;

    public C2715(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.f9005 = str;
        this.f9004 = f;
        this.f8997 = f2;
        this.f8998 = f3;
        this.f8996 = f4;
        this.f8999 = f5;
        this.f9002 = f6;
        this.f9003 = f7;
        this.f9000 = list;
        this.f9001 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2715)) {
            return false;
        }
        C2715 c2715 = (C2715) obj;
        return AbstractC3831.m6874(this.f9005, c2715.f9005) && this.f9004 == c2715.f9004 && this.f8997 == c2715.f8997 && this.f8998 == c2715.f8998 && this.f8996 == c2715.f8996 && this.f8999 == c2715.f8999 && this.f9002 == c2715.f9002 && this.f9003 == c2715.f9003 && AbstractC3831.m6874(this.f9000, c2715.f9000) && this.f9001.equals(c2715.f9001);
    }

    public final int hashCode() {
        return this.f9001.hashCode() + ((this.f9000.hashCode() + AbstractC3761.m6635(this.f9003, AbstractC3761.m6635(this.f9002, AbstractC3761.m6635(this.f8999, AbstractC3761.m6635(this.f8996, AbstractC3761.m6635(this.f8998, AbstractC3761.m6635(this.f8997, AbstractC3761.m6635(this.f9004, this.f9005.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3894(this);
    }
}
