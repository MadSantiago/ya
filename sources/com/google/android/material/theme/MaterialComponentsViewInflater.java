package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000.AbstractC0980;
import p000.AbstractC2765;
import p000.AbstractC2776;
import p000.C0324;
import p000.C1123;
import p000.C2465;
import p000.C3061;
import p000.C3141;
import p000.C3526;
import p000.C3755;
import p000.C3763;
import p000.C4693;
import p000.C5615;
import p000.C5653;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C3141 {
    @Override // p000.C3141
    /* JADX INFO: renamed from: ۥؗ */
    public final C5653 mo131(Context context, AttributeSet attributeSet) {
        return new C4693(context, attributeSet);
    }

    @Override // p000.C3141
    /* JADX INFO: renamed from: ۥُ */
    public final C3755 mo132(Context context, AttributeSet attributeSet) {
        C3763 c3763 = new C3763(AbstractC2765.m5150(context, attributeSet, R.attr.textViewStyle, 0, new int[0]), attributeSet, R.attr.textViewStyle);
        Context context2 = c3763.getContext();
        if (AbstractC2776.m5219(context2.getTheme(), ru.bluecat.yandexmapspatcher.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0980.f3457;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int iM6640 = C3763.m6640(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM6640 == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0980.f3456);
                    int iM6641 = C3763.m6640(c3763.getContext(), typedArrayObtainStyledAttributes3, 2, 4);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iM6641 >= 0) {
                        c3763.setLineHeight(iM6641);
                    }
                }
            }
        }
        return c3763;
    }

    @Override // p000.C3141
    /* JADX INFO: renamed from: ۥۗ */
    public final C2465 mo133(Context context, AttributeSet attributeSet) {
        return new C0324(context, attributeSet);
    }

    @Override // p000.C3141
    /* JADX INFO: renamed from: ۥۣ */
    public final C1123 mo134(Context context, AttributeSet attributeSet) {
        return new C5615(context, attributeSet);
    }

    @Override // p000.C3141
    /* JADX INFO: renamed from: ۦؑ */
    public final C3526 mo135(Context context, AttributeSet attributeSet) {
        return new C3061(context, attributeSet);
    }
}
