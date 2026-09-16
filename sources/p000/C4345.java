package p000;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: ۦًؙٗؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4345 extends AbstractC0993 {

    /* JADX INFO: renamed from: ۥً */
    public final C5894 f14336;

    /* JADX INFO: renamed from: ۥۧ */
    public final TextView f14337;

    /* JADX INFO: renamed from: ۦٚ */
    public boolean f14338 = true;

    public C4345(TextView textView) {
        this.f14337 = textView;
        this.f14336 = new C5894(textView);
    }

    @Override // p000.AbstractC0993
    /* JADX INFO: renamed from: ۥؙ */
    public final void mo2167(boolean z) {
        if (z) {
            m7638();
        }
    }

    /* JADX INFO: renamed from: ۥِ */
    public final void m7638() {
        TextView textView = this.f14337;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f14338) {
            if (!(transformationMethod instanceof C0609) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C0609(transformationMethod);
            }
        } else if (transformationMethod instanceof C0609) {
            transformationMethod = ((C0609) transformationMethod).f2284;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // p000.AbstractC0993
    /* JADX INFO: renamed from: ۥۡ */
    public final void mo2168(boolean z) {
        this.f14338 = z;
        m7638();
        TextView textView = this.f14337;
        textView.setFilters(mo2169(textView.getFilters()));
    }

    @Override // p000.AbstractC0993
    /* JADX INFO: renamed from: ۦؖ */
    public final InputFilter[] mo2169(InputFilter[] inputFilterArr) {
        if (!this.f14338) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C5894) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            C5894 c5894 = this.f14336;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c5894;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c5894) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
