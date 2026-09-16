package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ۥٜۘؕؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2165 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C4693 f7143;

    /* JADX INFO: renamed from: ۥۣ */
    public C0904 f7144;

    public C2165(C4693 c4693) {
        this.f7143 = c4693;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m4218(Drawable drawable) {
        C4693 c4693 = this.f7143;
        ColorStateList colorStateList = c4693.f15465;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(c4693.f15476, colorStateList.getDefaultColor()));
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4219(Drawable drawable) {
        ColorStateList colorStateList = this.f7143.f15465;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }
}
