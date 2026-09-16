package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥؘُؓۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0665 extends C4688 {

    /* JADX INFO: renamed from: ۦٌ */
    public final boolean f2449;

    public C0665(String str, C4373 c4373) {
        super(str, c4373, 1);
        this.f2449 = true;
    }

    @Override // p000.C4688
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0665) {
            InterfaceC0103 interfaceC0103 = (InterfaceC0103) obj;
            if (this.f15437.equals(interfaceC0103.mo186())) {
                C0665 c0665 = (C0665) obj;
                if (c0665.f2449 && Arrays.equals((InterfaceC0103[]) this.f15442.getValue(), (InterfaceC0103[]) c0665.f15442.getValue())) {
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
        }
        return false;
    }

    @Override // p000.C4688
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo185() {
        return this.f2449;
    }
}
