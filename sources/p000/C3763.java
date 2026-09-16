package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦٍؘؒۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3763 extends C3755 {
    /* JADX INFO: renamed from: ۦۙ */
    public static int m6640(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i = 0; i < iArr.length && dimensionPixelSize < 0; i++) {
            int i2 = iArr[i];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i2, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            }
        }
        return dimensionPixelSize;
    }

    @Override // p000.C3755, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (AbstractC2776.m5219(context.getTheme(), R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, AbstractC0980.f3456);
            int iM6640 = m6640(getContext(), typedArrayObtainStyledAttributes, 2, 4);
            typedArrayObtainStyledAttributes.recycle();
            if (iM6640 >= 0) {
                setLineHeight(iM6640);
            }
        }
    }
}
