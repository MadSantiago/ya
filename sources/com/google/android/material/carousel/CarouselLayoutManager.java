package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Collections;
import p000.AbstractC0980;
import p000.AbstractC4294;
import p000.AbstractC4593;
import p000.AbstractC5078;
import p000.C1078;
import p000.C3308;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC4593 {

    /* JADX INFO: renamed from: ۦٛ */
    public AbstractC4294 f322;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        Paint paint = new Paint();
        Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0980.f3452);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m124(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final void m124(int i) {
        C3308 c3308;
        if (i != 0 && i != 1) {
            C1078.m2272(AbstractC5078.m8670(i, "invalid orientation:"));
            return;
        }
        AbstractC4294 abstractC4294 = this.f322;
        if (abstractC4294 == null || i != abstractC4294.f14205) {
            if (i == 0) {
                c3308 = new C3308(0);
            } else {
                if (i != 1) {
                    C1078.m2272("invalid orientation");
                    return;
                }
                c3308 = new C3308(1);
            }
            this.f322 = c3308;
        }
    }

    public CarouselLayoutManager() {
        Paint paint = new Paint();
        Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        m124(0);
    }
}
