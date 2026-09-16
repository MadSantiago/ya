package androidx.preference.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import p000.AbstractC2188;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class PreferenceImageView extends ImageView {

    /* JADX INFO: renamed from: ۦ۟ */
    public int f226;

    /* JADX INFO: renamed from: ۦۨ */
    public int f227;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f227 = Integer.MAX_VALUE;
        this.f226 = Integer.MAX_VALUE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2188.f7258, 0, 0);
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE));
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f226;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f227;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i2);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i2 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i) {
        this.f226 = i;
        super.setMaxHeight(i);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i) {
        this.f227 = i;
        super.setMaxWidth(i);
    }

    public PreferenceImageView(Context context) {
        this(context, null);
    }
}
