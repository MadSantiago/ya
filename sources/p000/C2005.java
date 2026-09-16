package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥٟۣؔٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2005 extends AbstractC1090 {

    /* JADX INFO: renamed from: ۥؓ */
    public final float f6605;

    /* JADX INFO: renamed from: ۥؖ */
    public final float f6606;

    /* JADX INFO: renamed from: ۥَ */
    public final float f6607;

    /* JADX INFO: renamed from: ۥْ */
    public final int f6608;

    /* JADX INFO: renamed from: ۥٓ */
    public final AbstractC0548 f6609;

    /* JADX INFO: renamed from: ۥٖ */
    public final AbstractC0548 f6610;

    /* JADX INFO: renamed from: ۥٙ */
    public final float f6611;

    /* JADX INFO: renamed from: ۥۖ */
    public final int f6612;

    /* JADX INFO: renamed from: ۥۧ */
    public final float f6613;

    /* JADX INFO: renamed from: ۦٕ */
    public final int f6614;

    /* JADX INFO: renamed from: ۦٗ */
    public final float f6615;

    /* JADX INFO: renamed from: ۦۛ */
    public final float f6616;

    /* JADX INFO: renamed from: ۦ۟ */
    public final List f6617;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f6618;

    public C2005(String str, List list, int i, AbstractC0548 abstractC0548, float f, AbstractC0548 abstractC0549, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.f6618 = str;
        this.f6617 = list;
        this.f6608 = i;
        this.f6609 = abstractC0548;
        this.f6607 = f;
        this.f6610 = abstractC0549;
        this.f6615 = f2;
        this.f6616 = f3;
        this.f6612 = i2;
        this.f6614 = i3;
        this.f6611 = f4;
        this.f6606 = f5;
        this.f6605 = f6;
        this.f6613 = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2005.class != obj.getClass()) {
            return false;
        }
        C2005 c2005 = (C2005) obj;
        return this.f6618.equals(c2005.f6618) && AbstractC3831.m6874(this.f6609, c2005.f6609) && this.f6607 == c2005.f6607 && AbstractC3831.m6874(this.f6610, c2005.f6610) && this.f6615 == c2005.f6615 && this.f6616 == c2005.f6616 && this.f6612 == c2005.f6612 && this.f6614 == c2005.f6614 && this.f6611 == c2005.f6611 && this.f6606 == c2005.f6606 && this.f6605 == c2005.f6605 && this.f6613 == c2005.f6613 && this.f6608 == c2005.f6608 && AbstractC3831.m6874(this.f6617, c2005.f6617);
    }

    public final int hashCode() {
        int iHashCode = (this.f6617.hashCode() + (this.f6618.hashCode() * 31)) * 31;
        AbstractC0548 abstractC0548 = this.f6609;
        int iM6635 = AbstractC3761.m6635(this.f6607, (iHashCode + (abstractC0548 != null ? abstractC0548.hashCode() : 0)) * 31, 31);
        AbstractC0548 abstractC0549 = this.f6610;
        return Integer.hashCode(this.f6608) + AbstractC3761.m6635(this.f6613, AbstractC3761.m6635(this.f6605, AbstractC3761.m6635(this.f6606, AbstractC3761.m6635(this.f6611, AbstractC2049.m3999(this.f6614, AbstractC2049.m3999(this.f6612, AbstractC3761.m6635(this.f6616, AbstractC3761.m6635(this.f6615, (iM6635 + (abstractC0549 != null ? abstractC0549.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
