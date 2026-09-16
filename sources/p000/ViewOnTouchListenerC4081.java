package p000;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: ۦْؕٞۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC4081 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ۥٕ */
    public static final int f13604 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: ۥؓ */
    public boolean f13605;

    /* JADX INFO: renamed from: ۥؖ */
    public boolean f13606;

    /* JADX INFO: renamed from: ۥً */
    public boolean f13607;

    /* JADX INFO: renamed from: ۥَ */
    public final float[] f13608;

    /* JADX INFO: renamed from: ۥْ */
    public final C1391 f13609;

    /* JADX INFO: renamed from: ۥٓ */
    public RunnableC3365 f13610;

    /* JADX INFO: renamed from: ۥٖ */
    public final float[] f13611;

    /* JADX INFO: renamed from: ۥٙ */
    public boolean f13612;

    /* JADX INFO: renamed from: ۥۖ */
    public final float[] f13613;

    /* JADX INFO: renamed from: ۥۧ */
    public boolean f13614;

    /* JADX INFO: renamed from: ۦٕ */
    public final float[] f13615;

    /* JADX INFO: renamed from: ۦٗ */
    public final int f13616;

    /* JADX INFO: renamed from: ۦٚ */
    public final C1391 f13617;

    /* JADX INFO: renamed from: ۦۛ */
    public final float[] f13618;

    /* JADX INFO: renamed from: ۦ۟ */
    public final AccelerateInterpolator f13619;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2280 f13620;

    public ViewOnTouchListenerC4081(C1391 c1391) {
        C2280 c2280 = new C2280();
        c2280.f7574 = Long.MIN_VALUE;
        c2280.f7581 = -1L;
        c2280.f7575 = 0L;
        this.f13620 = c2280;
        this.f13619 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f13608 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f13611 = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f13618 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f13613 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f13615 = fArr5;
        this.f13609 = c1391;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f13616 = f13604;
        c2280.f7578 = 500;
        c2280.f7576 = 500;
        this.f13617 = c1391;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static float m7265(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.f13607
            r1 = 0
            if (r0 != 0) goto L7
            goto L78
        L7:
            int r0 = r10.getActionMasked()
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 == r2) goto L1f
            r9 = 3
            if (r0 == r9) goto L17
            goto L78
        L17:
            r8.m7269()
            return r1
        L1b:
            r8.f13605 = r3
            r8.f13612 = r1
        L1f:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            ۥُٕؓؐ r5 = r8.f13609
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.m7268(r0, r4, r6, r1)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.m7268(r10, r9, r4, r3)
            ۥۚؕٛؕ r10 = r8.f13620
            r10.f7573 = r0
            r10.f7579 = r9
            boolean r9 = r8.f13614
            if (r9 != 0) goto L78
            boolean r9 = r8.m7267()
            if (r9 == 0) goto L78
            ۦؖؖؔٓ r9 = r8.f13610
            if (r9 != 0) goto L60
            ۦؖؖؔٓ r9 = new ۦؖؖؔٓ
            r9.<init>(r2, r8)
            r8.f13610 = r9
        L60:
            r8.f13614 = r3
            r8.f13606 = r3
            boolean r10 = r8.f13612
            if (r10 != 0) goto L73
            int r10 = r8.f13616
            if (r10 <= 0) goto L73
            long r6 = (long) r10
            java.util.WeakHashMap r10 = p000.AbstractC3608.f12013
            r5.postOnAnimationDelayed(r9, r6)
            goto L76
        L73:
            r9.run()
        L76:
            r8.f13612 = r3
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnTouchListenerC4081.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final float m7266(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.f13614) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final boolean m7267() {
        C1391 c1391;
        int count;
        C2280 c2280 = this.f13620;
        float f = c2280.f7579;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c2280.f7573);
        if (iAbs != 0 && (count = (c1391 = this.f13617).getCount()) != 0) {
            int childCount = c1391.getChildCount();
            int firstVisiblePosition = c1391.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c1391.getChildAt(0).getTop() >= 0)) : !(i >= count && c1391.getChildAt(childCount - 1).getBottom() <= c1391.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX INFO: renamed from: ۥۣ */
    public final float m7268(float f, float f2, float f3, int i) {
        float fM7265;
        float interpolation;
        float fM7266 = m7265(this.f13608[i] * f2, 0.0f, this.f13611[i]);
        float fM7267 = m7266(f2 - f, fM7266) - m7266(f, fM7266);
        AccelerateInterpolator accelerateInterpolator = this.f13619;
        if (fM7267 >= 0.0f) {
            if (fM7267 > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fM7267);
            } else {
                fM7265 = 0.0f;
            }
            if (fM7265 == 0.0f) {
                return 0.0f;
            }
            float f4 = this.f13618[i];
            float f5 = this.f13613[i];
            float f6 = this.f13615[i];
            float f7 = f4 * f3;
            return fM7265 > 0.0f ? m7265(fM7265 * f7, f5, f6) : -m7265((-fM7265) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fM7267);
        fM7265 = m7265(interpolation, -1.0f, 1.0f);
        if (fM7265 == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f13618[i];
        float f9 = this.f13613[i];
        float f10 = this.f13615[i];
        float f11 = f8 * f3;
        if (fM7265 > 0.0f) {
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m7269() {
        int i = 0;
        if (this.f13606) {
            this.f13614 = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C2280 c2280 = this.f13620;
        int i2 = (int) (jCurrentAnimationTimeMillis - c2280.f7574);
        int i3 = c2280.f7576;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c2280.f7580 = i;
        c2280.f7577 = c2280.m4340(jCurrentAnimationTimeMillis);
        c2280.f7581 = jCurrentAnimationTimeMillis;
    }
}
