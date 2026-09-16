package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import java.util.Arrays;

/* JADX INFO: renamed from: ۥٛؓؔۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1765 {

    /* JADX INFO: renamed from: ۥؗ */
    public final ColorSpace f5876;

    /* JADX INFO: renamed from: ۥُ */
    public final int f5877;

    /* JADX INFO: renamed from: ۥّ */
    public final boolean f5878;

    /* JADX INFO: renamed from: ۥۗ */
    public final Bitmap.Config f5879;

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean f5880;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f5881;

    /* JADX INFO: renamed from: ۦؑ */
    public final C0181 f5882;

    /* JADX INFO: renamed from: ۦؚ */
    public final C5311 f5883;

    /* JADX INFO: renamed from: ۦٌ */
    public final int f5884;

    /* JADX INFO: renamed from: ۦِ */
    public final C4714 f5885;

    /* JADX INFO: renamed from: ۦٛ */
    public final String f5886;

    /* JADX INFO: renamed from: ۦۗ */
    public final C4130 f5887;

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean f5888;

    /* JADX INFO: renamed from: ۦۚ */
    public final int f5889;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f5890;

    public C1765(Context context, Bitmap.Config config, ColorSpace colorSpace, C0181 c0181, int i, boolean z, boolean z2, boolean z3, String str, C4714 c4714, C4130 c4130, C5311 c5311, int i2, int i3, int i4) {
        this.f5881 = context;
        this.f5879 = config;
        this.f5876 = colorSpace;
        this.f5882 = c0181;
        this.f5877 = i;
        this.f5878 = z;
        this.f5888 = z2;
        this.f5880 = z3;
        this.f5886 = str;
        this.f5885 = c4714;
        this.f5887 = c4130;
        this.f5883 = c5311;
        this.f5884 = i2;
        this.f5889 = i3;
        this.f5890 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1765)) {
            return false;
        }
        C1765 c1765 = (C1765) obj;
        return AbstractC3831.m6874(this.f5881, c1765.f5881) && this.f5879 == c1765.f5879 && AbstractC3831.m6874(this.f5876, c1765.f5876) && AbstractC3831.m6874(this.f5882, c1765.f5882) && this.f5877 == c1765.f5877 && this.f5878 == c1765.f5878 && this.f5888 == c1765.f5888 && this.f5880 == c1765.f5880 && AbstractC3831.m6874(this.f5886, c1765.f5886) && AbstractC3831.m6874(this.f5885, c1765.f5885) && AbstractC3831.m6874(this.f5887, c1765.f5887) && AbstractC3831.m6874(this.f5883, c1765.f5883) && this.f5884 == c1765.f5884 && this.f5889 == c1765.f5889 && this.f5890 == c1765.f5890;
    }

    public final int hashCode() {
        int iHashCode = (this.f5879.hashCode() + (this.f5881.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f5876;
        int iM8672 = AbstractC5078.m8672(AbstractC5078.m8672(AbstractC5078.m8672((AbstractC3761.m6632(this.f5877) + ((this.f5882.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f5878), 31, this.f5888), 31, this.f5880);
        String str = this.f5886;
        return AbstractC3761.m6632(this.f5890) + ((AbstractC3761.m6632(this.f5889) + ((AbstractC3761.m6632(this.f5884) + ((this.f5883.f17489.hashCode() + ((this.f5887.f13752.hashCode() + ((((iM8672 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f5885.f15544)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
