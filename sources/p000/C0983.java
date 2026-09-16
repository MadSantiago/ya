package p000;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ۥٌٍؘؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0983 implements InterfaceC0633 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C1765 f3476;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC1237 f3477;

    public C0983(AbstractC1237 abstractC1237, C1765 c1765) {
        this.f3477 = abstractC1237;
        this.f3476 = c1765;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥؗ */
    public final Drawable m2100(Drawable drawable, AbstractC0772 abstractC0772) {
        C2620 c2620;
        if (abstractC0772 instanceof C2620) {
            c2620 = (C2620) abstractC0772;
            int i = c2620.f8723;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2620.f8723 = i - Integer.MIN_VALUE;
            } else {
                c2620 = new C2620(this, abstractC0772);
            }
        } else {
            c2620 = new C2620(this, abstractC0772);
        }
        Object obj = c2620.f8722;
        int i2 = c2620.f8723;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            if (!AbstractC5550.m9299(drawable)) {
                return drawable;
            }
            AnimatedImageDrawable animatedImageDrawableM9284 = AbstractC5550.m9284(drawable);
            C1765 c1765 = this.f3476;
            C5311 c5311 = c1765.f5883;
            C5311 c5312 = c1765.f5883;
            if (c5311.f17489.get("coil#repeat_count") != null) {
                C0178.m382();
                return null;
            }
            animatedImageDrawableM9284.setRepeatCount(-1);
            if (c5312.f17489.get("coil#animation_start_callback") != null) {
                C0178.m382();
                return null;
            }
            if (c5312.f17489.get("coil#animation_end_callback") != null) {
                C0178.m382();
                return null;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(obj);
            this = null;
            drawable = null;
        }
        return new C0746(drawable, this.f3476.f5877);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final ImageDecoder.Source m2101(AbstractC1237 abstractC1237) {
        C5051 c5051Mo2611 = abstractC1237.mo2611();
        if (c5051Mo2611 != null) {
            return ImageDecoder.createSource(c5051Mo2611.toFile());
        }
        AbstractC3925 abstractC3925Mo2613 = abstractC1237.mo2613();
        boolean z = abstractC3925Mo2613 instanceof C0976;
        C1765 c1765 = this.f3476;
        if (z) {
            return ImageDecoder.createSource(c1765.f5881.getAssets(), ((C0976) abstractC3925Mo2613).f3439);
        }
        if (abstractC3925Mo2613 instanceof C1313) {
            return ImageDecoder.createSource(c1765.f5881.getContentResolver(), ((C1313) abstractC3925Mo2613).f4534);
        }
        if (abstractC3925Mo2613 instanceof C3335) {
            C3335 c3335 = (C3335) abstractC3925Mo2613;
            if (c3335.f11158.equals(c1765.f5881.getPackageName())) {
                return ImageDecoder.createSource(c1765.f5881.getResources(), c3335.f11156);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return ImageDecoder.createSource(abstractC1237.mo2610().mo2666());
        }
        return i == 30 ? ImageDecoder.createSource(ByteBuffer.wrap(abstractC1237.mo2610().mo2666())) : ImageDecoder.createSource(abstractC1237.mo2612().toFile());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.InterfaceC0633
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo1409(InterfaceC0443 interfaceC0443) {
        C1526 c1526;
        C5662 c5662;
        Object objM7909;
        C5662 c5663;
        if (interfaceC0443 instanceof C1526) {
            c1526 = (C1526) interfaceC0443;
            int i = c1526.f5171;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1526.f5171 = i - Integer.MIN_VALUE;
            } else {
                c1526 = new C1526(this, (AbstractC0772) interfaceC0443);
            }
        } else {
            c1526 = new C1526(this, (AbstractC0772) interfaceC0443);
        }
        Object obj = c1526.f5169;
        int i2 = c1526.f5171;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            c5662 = new C5662();
            C5304 c5304 = new C5304(7, this, c5662);
            c1526.f5168 = this;
            c1526.f5167 = c5662;
            c1526.f5171 = 1;
            objM7909 = AbstractC4554.m7909(c5304, c1526);
            if (objM7909 != enumC2282) {
            }
            return enumC2282;
        }
        if (i2 == 1) {
            C5662 c5664 = c1526.f5167;
            C0983 c0983 = (C0983) c1526.f5168;
            AbstractC0186.m409(obj);
            c5662 = c5664;
            this = c0983;
            objM7909 = obj;
        } else {
            if (i2 != 2) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c5663 = (C5662) c1526.f5168;
            AbstractC0186.m409(obj);
        }
        return new C5303((Drawable) obj, c5663.f18631);
        c1526.f5168 = c5662;
        c1526.f5167 = null;
        c1526.f5171 = 2;
        Drawable drawableM2100 = this.m2100((Drawable) objM7909, c1526);
        if (drawableM2100 != enumC2282) {
            C5662 c5665 = c5662;
            obj = drawableM2100;
            c5663 = c5665;
            return new C5303((Drawable) obj, c5663.f18631);
        }
        return enumC2282;
    }
}
