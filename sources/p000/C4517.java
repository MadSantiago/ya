package p000;

import android.content.Context;
import android.os.Build;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦؘؙْٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4517 implements InterfaceC5449 {

    /* JADX INFO: renamed from: ۥّ */
    public static boolean f14924 = true;

    /* JADX INFO: renamed from: ۥؗ */
    public C4078 f14925;

    /* JADX INFO: renamed from: ۥُ */
    public final ComponentCallbacks2C2286 f14926;

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f14927 = new Object();

    /* JADX INFO: renamed from: ۥۣ */
    public final ViewTreeObserverOnGlobalLayoutListenerC0850 f14928;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f14929;

    public C4517(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850) {
        this.f14928 = viewTreeObserverOnGlobalLayoutListenerC0850;
        ComponentCallbacks2C2286 componentCallbacks2C2286 = new ComponentCallbacks2C2286();
        this.f14926 = componentCallbacks2C2286;
        if (viewTreeObserverOnGlobalLayoutListenerC0850.isAttachedToWindow()) {
            Context context = viewTreeObserverOnGlobalLayoutListenerC0850.getContext();
            if (!this.f14929) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C2286);
                this.f14929 = true;
            }
        }
        viewTreeObserverOnGlobalLayoutListenerC0850.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3944(0, this));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC2717 m7835(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850) {
        C4078 c4078 = this.f14925;
        if (c4078 != null) {
            return c4078;
        }
        C4078 c4079 = new C4078(viewTreeObserverOnGlobalLayoutListenerC0850.getContext());
        c4079.setClipChildren(false);
        c4079.setClipToPadding(false);
        c4079.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        viewTreeObserverOnGlobalLayoutListenerC0850.addView(c4079, -1);
        this.f14925 = c4079;
        return c4079;
    }

    @Override // p000.InterfaceC5449
    /* JADX INFO: renamed from: ۥۗ */
    public final C4893 mo7836() {
        InterfaceC3053 c0534;
        InterfaceC3053 c1721;
        C4893 c4893;
        synchronized (this.f14927) {
            try {
                ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = this.f14928;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    viewTreeObserverOnGlobalLayoutListenerC0850.getUniqueDrawingId();
                }
                if (i >= 29) {
                    c1721 = new C1721();
                } else {
                    if (f14924) {
                        try {
                            c0534 = new C2906(this.f14928, new C3379(), new C2004());
                        } catch (Throwable unused) {
                            f14924 = false;
                            c0534 = new C0534(m7835(this.f14928));
                        }
                    } else {
                        c0534 = new C0534(m7835(this.f14928));
                    }
                    c1721 = c0534;
                }
                c4893 = new C4893(c1721);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4893;
    }

    @Override // p000.InterfaceC5449
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo7837(C4893 c4893) {
        synchronized (this.f14927) {
            if (!c4893.f16113) {
                c4893.f16113 = true;
                c4893.m8232();
            }
        }
    }
}
