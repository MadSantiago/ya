package p000;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦٞؒۖٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4787 implements InterfaceC0611 {

    /* JADX INFO: renamed from: ۥۗ */
    public final float[] f15792;

    /* JADX INFO: renamed from: ۥۣ */
    public final int[] f15793;

    public C4787(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f15793 = new int[size];
        this.f15792 = new float[size];
        for (int i = 0; i < size; i++) {
            this.f15793[i] = ((Integer) arrayList.get(i)).intValue();
            this.f15792[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m8172(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.f15792;
        if (z) {
            m8172((View) parent, fArr);
            float f = -view.getScrollX();
            float f2 = -view.getScrollY();
            C0132.m294(fArr2);
            C0132.m291(fArr2, f, f2);
            C4773.m8139(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            C0132.m294(fArr2);
            C0132.m291(fArr2, left, top);
            C4773.m8139(fArr, fArr2);
        } else {
            int[] iArr = this.f15793;
            view.getLocationInWindow(iArr);
            float f3 = -view.getScrollX();
            float f4 = -view.getScrollY();
            C0132.m294(fArr2);
            C0132.m291(fArr2, f3, f4);
            C4773.m8139(fArr, fArr2);
            float f5 = iArr[0];
            float f6 = iArr[1];
            C0132.m294(fArr2);
            C0132.m291(fArr2, f5, f6);
            C4773.m8139(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AbstractC0487.m1040(matrix, fArr2);
        C4773.m8139(fArr, fArr2);
    }

    @Override // p000.InterfaceC0611
    /* JADX INFO: renamed from: ۥۣ */
    public void mo1375(View view, float[] fArr) {
        C0132.m294(fArr);
        m8172(view, fArr);
    }

    public C4787(int i, int i2) {
        this.f15793 = new int[]{i, i2};
        this.f15792 = new float[]{0.0f, 1.0f};
    }

    public C4787(int i, int i2, int i3) {
        this.f15793 = new int[]{i, i2, i3};
        this.f15792 = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C4787(float[] fArr) {
        this.f15792 = fArr;
        this.f15793 = new int[2];
    }
}
