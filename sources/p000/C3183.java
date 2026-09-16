package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: ۦؓؕۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3183 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f10690;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10691;

    public /* synthetic */ C3183(int i, Object obj) {
        this.f10691 = i;
        this.f10690 = obj;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f10691) {
            case 0:
                ((C3286) this.f10690).m6045(new C1770(this, bundle, activity));
                break;
            default:
                m5856(C3156.m5837(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f10691) {
            case 0:
                ((C3286) this.f10690).m6045(new C4776(this, activity, 4));
                break;
            default:
                m5859(C3156.m5837(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f10691) {
            case 0:
                ((C3286) this.f10690).m6045(new C4776(this, activity, 2));
                break;
            default:
                m5857(C3156.m5837(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f10691) {
            case 0:
                ((C3286) this.f10690).m6045(new C4776(this, activity, 1));
                break;
            default:
                m5858(C3156.m5837(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f10691) {
            case 0:
                BinderC0902 binderC0902 = new BinderC0902();
                ((C3286) this.f10690).m6045(new C1770(this, activity, binderC0902));
                Bundle bundleM1887 = binderC0902.m1887(50L);
                if (bundleM1887 != null) {
                    bundle.putAll(bundleM1887);
                }
                break;
            default:
                m5860(C3156.m5837(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f10691) {
            case 0:
                ((C3286) this.f10690).m6045(new C4776(this, activity, 0));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f10691) {
            case 0:
                ((C3286) this.f10690).m6045(new C4776(this, activity, 3));
                break;
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void m5856(C3156 c3156, Bundle bundle) {
        Uri uri;
        C5371 c5371 = (C5371) ((C5235) this.f10690).f18660;
        try {
            try {
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                c3610.f12023.m9432("onActivityCreated");
                Intent intent = c3156.f10635;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                        uri = null;
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        C5371.m9021(c5371.f17721);
                        String str = C1512.m3187(intent) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter("referrer");
                        boolean z = bundle == null;
                        C3644 c3644 = c5371.f17733;
                        C5371.m9020(c3644);
                        c3644.m6515(new RunnableC0836(this, z, uri, str, queryParameter));
                    }
                }
            } catch (RuntimeException e) {
                C3610 c3611 = c5371.f17717;
                C5371.m9020(c3611);
                c3611.f12020.m9430(e, "Throwable caught in onActivityCreated");
            }
        } finally {
            C5266 c5266 = c5371.f17711;
            C5371.m9023(c5266);
            c5266.m8901(c3156, bundle);
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m5857(C3156 c3156) {
        C5371 c5371 = (C5371) ((C5235) this.f10690).f18660;
        C5266 c5266 = c5371.f17711;
        C5371.m9023(c5266);
        synchronized (c5266.f17352) {
            c5266.f17357 = false;
            c5266.f17361 = true;
        }
        C5371 c5372 = (C5371) c5266.f18660;
        c5372.f17719.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c5372.f17715.m1161()) {
            C0932 c0932M8897 = c5266.m8897(c3156);
            c5266.f17355 = c5266.f17354;
            c5266.f17354 = null;
            C3644 c3644 = c5372.f17733;
            C5371.m9020(c3644);
            c3644.m6515(new RunnableC0226(c5266, c0932M8897, jElapsedRealtime));
        } else {
            c5266.f17354 = null;
            C3644 c3645 = c5372.f17733;
            C5371.m9020(c3645);
            c3645.m6515(new RunnableC4424(c5266, jElapsedRealtime));
        }
        C4423 c4423 = c5371.f17735;
        C5371.m9023(c4423);
        C5371 c5373 = (C5371) c4423.f18660;
        c5373.f17719.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        C3644 c3646 = c5373.f17733;
        C5371.m9020(c3646);
        c3646.m6515(new RunnableC4199(c4423, jElapsedRealtime2, 1));
    }

    /* JADX INFO: renamed from: ۥّ */
    public void m5858(C3156 c3156) {
        C5371 c5371 = (C5371) ((C5235) this.f10690).f18660;
        C4423 c4423 = c5371.f17735;
        C5371.m9023(c4423);
        C5371 c5372 = (C5371) c4423.f18660;
        c5372.f17719.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C3644 c3644 = c5372.f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC4199(c4423, jElapsedRealtime, 0));
        C5266 c5266 = c5371.f17711;
        C5371.m9023(c5266);
        Object obj = c5266.f17352;
        synchronized (obj) {
            try {
                c5266.f17357 = true;
                if (!Objects.equals(c3156, c5266.f17360)) {
                    synchronized (obj) {
                        c5266.f17360 = c3156;
                        c5266.f17361 = false;
                        C5371 c5373 = (C5371) c5266.f18660;
                        if (c5373.f17715.m1161()) {
                            c5266.f17358 = null;
                            C3644 c3645 = c5373.f17733;
                            C5371.m9020(c3645);
                            c3645.m6515(new RunnableC5622(c5266, 1));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C5371 c5374 = (C5371) c5266.f18660;
        if (!c5374.f17715.m1161()) {
            c5266.f17354 = c5266.f17358;
            C3644 c3646 = c5374.f17733;
            C5371.m9020(c3646);
            c3646.m6515(new RunnableC5622(c5266, 0));
            return;
        }
        c5266.m8899(c3156.f10636, c5266.m8897(c3156), false);
        C4961 c4961 = ((C5371) c5266.f18660).f17725;
        C5371.m9022(c4961);
        C5371 c5375 = (C5371) c4961.f18660;
        c5375.f17719.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        C3644 c3647 = c5375.f17733;
        C5371.m9020(c3647);
        c3647.m6515(new RunnableC4424(c4961, jElapsedRealtime2));
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void m5859(C3156 c3156) {
        C5266 c5266 = ((C5371) ((C5235) this.f10690).f18660).f17711;
        C5371.m9023(c5266);
        synchronized (c5266.f17352) {
            try {
                if (Objects.equals(c5266.f17360, c3156)) {
                    c5266.f17360 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C5371) c5266.f18660).f17715.m1161()) {
            c5266.f17356.remove(Integer.valueOf(c3156.f10637));
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public void m5860(C3156 c3156, Bundle bundle) {
        C0932 c0932;
        C5266 c5266 = ((C5371) ((C5235) this.f10690).f18660).f17711;
        C5371.m9023(c5266);
        if (!((C5371) c5266.f18660).f17715.m1161() || bundle == null || (c0932 = (C0932) c5266.f17356.get(Integer.valueOf(c3156.f10637))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c0932.f3316);
        bundle2.putString("name", c0932.f3320);
        bundle2.putString("referrer_name", c0932.f3319);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX INFO: renamed from: ۥۗ */
    private final void m5854(Activity activity) {
    }

    /* JADX INFO: renamed from: ۥۣ */
    private final void m5855(Activity activity) {
    }
}
