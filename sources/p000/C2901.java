package p000;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: ۥۨؑۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2901 implements InterfaceC0611 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Matrix f9662 = new Matrix();

    /* JADX INFO: renamed from: ۥۗ */
    public final int[] f9661 = new int[2];

    @Override // p000.InterfaceC0611
    /* JADX INFO: renamed from: ۥۣ */
    public void mo1375(View view, float[] fArr) {
        Matrix matrix = this.f9662;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f9661;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        AbstractC0487.m1040(matrix, fArr);
    }
}
