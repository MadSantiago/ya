package p000;

import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥٗؑؖٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1500 extends AbstractActivityC1700 implements InterfaceC4680, InterfaceC5833, InterfaceC3983 {

    /* JADX INFO: renamed from: ۥؓ */
    public final CopyOnWriteArrayList f5086;

    /* JADX INFO: renamed from: ۥؖ */
    public final CopyOnWriteArrayList f5087;

    /* JADX INFO: renamed from: ۥً */
    public final CopyOnWriteArrayList f5088;

    /* JADX INFO: renamed from: ۥَ */
    public C3160 f5089;

    /* JADX INFO: renamed from: ۥْ */
    public final C2808 f5090;

    /* JADX INFO: renamed from: ۥٓ */
    public final C2346 f5091;

    /* JADX INFO: renamed from: ۥٕ */
    public boolean f5092;

    /* JADX INFO: renamed from: ۥٖ */
    public final ViewTreeObserverOnDrawListenerC4281 f5093;

    /* JADX INFO: renamed from: ۥٙ */
    public final CopyOnWriteArrayList f5094;

    /* JADX INFO: renamed from: ۥۖ */
    public final CopyOnWriteArrayList f5095;

    /* JADX INFO: renamed from: ۥۙ */
    public final C2432 f5096;

    /* JADX INFO: renamed from: ۥۧ */
    public final CopyOnWriteArrayList f5097;

    /* JADX INFO: renamed from: ۦؙ */
    public final C2432 f5098;

    /* JADX INFO: renamed from: ۦٕ */
    public final CopyOnWriteArrayList f5099;

    /* JADX INFO: renamed from: ۦٗ */
    public final C2432 f5100;

    /* JADX INFO: renamed from: ۦٚ */
    public boolean f5101;

    /* JADX INFO: renamed from: ۦۛ */
    public final C0331 f5102;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3225 f5103;

    public AbstractActivityC1500() {
        C3225 c3225 = new C3225();
        c3225.f10839 = new CopyOnWriteArraySet();
        this.f5103 = c3225;
        int i = 1;
        this.f5090 = new C2808(new RunnableC3697(this, 1));
        int i2 = 0;
        C5140 c5140 = new C5140(this, new C0463(i2, this));
        C2346 c2346 = new C2346(c5140, 6);
        this.f5091 = c2346;
        this.f5093 = new ViewTreeObserverOnDrawListenerC4281(this);
        this.f5100 = new C2432(new C4247(this, i));
        new AtomicInteger();
        this.f5102 = new C0331(this);
        this.f5095 = new CopyOnWriteArrayList();
        this.f5099 = new CopyOnWriteArrayList();
        this.f5094 = new CopyOnWriteArrayList();
        this.f5087 = new CopyOnWriteArrayList();
        this.f5086 = new CopyOnWriteArrayList();
        this.f5097 = new CopyOnWriteArrayList();
        this.f5088 = new CopyOnWriteArrayList();
        this.f5096 = new C2432(new C4247(this, 2));
        C4170 c4170 = this.f5665;
        if (c4170 == null) {
            C1078.m2276("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        c4170.mo2388(new C1375(i2, this));
        this.f5665.mo2388(new C1375(i, this));
        this.f5665.mo2388(new C4654(i, this));
        c5140.m8749();
        AbstractC2765.m5123(this);
        ((C2346) c2346.f7785).m4413("android:support:activity-result", new C5444(i2, this));
        m3181(new C0301(this, i2));
        this.f5098 = new C2432(new C4247(this, 4));
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final void m3177(AbstractActivityC1500 abstractActivityC1500) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!AbstractC3831.m6874(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!AbstractC3831.m6874(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m3180();
        this.f5093.m7579(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f5102.m762(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((C4429) this.f5096.getValue()).m2864();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f5095.iterator();
        while (it.hasNext()) {
            ((InterfaceC3281) it.next()).accept(configuration);
        }
    }

    @Override // p000.AbstractActivityC1700, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f5091.m4398(bundle);
        C3225 c3225 = this.f5103;
        c3225.f10838 = this;
        Iterator it = ((CopyOnWriteArraySet) c3225.f10839).iterator();
        while (it.hasNext()) {
            ((InterfaceC1896) it.next()).mo632();
        }
        super.onCreate(bundle);
        int i = FragmentC3857.f12886;
        AbstractC2298.m4348(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f5090.f9376).iterator();
        while (it.hasNext()) {
            ((C2050) it.next()).f6760.m5308();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f5090.f9376).iterator();
            while (it.hasNext()) {
                if (((C2050) it.next()).f6760.m5312()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f5101 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f5101 = false;
            Iterator it = this.f5087.iterator();
            while (it.hasNext()) {
                ((InterfaceC3281) it.next()).accept(new C5842(z));
            }
        } catch (Throwable th) {
            this.f5101 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f5094.iterator();
        while (it.hasNext()) {
            ((InterfaceC3281) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f5090.f9376).iterator();
        while (it.hasNext()) {
            ((C2050) it.next()).f6760.m5275();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f5092 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f5092 = false;
            Iterator it = this.f5086.iterator();
            while (it.hasNext()) {
                ((InterfaceC3281) it.next()).accept(new C5882(z));
            }
        } catch (Throwable th) {
            this.f5092 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        C4036 c4036;
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        int i2 = 20;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            c4036 = new C4036(i2);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            c4036 = new C4036(i2);
        } else {
            c4036 = new C4036(i2);
        }
        Iterator it = this.f5097.iterator();
        while (it.hasNext()) {
            ((InterfaceC3281) it.next()).accept(c4036);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f5090.f9376).iterator();
        while (it.hasNext()) {
            ((C2050) it.next()).f6760.m5277();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f5102.m762(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C4220 c4220;
        C3160 c3160 = this.f5089;
        if (c3160 == null && (c4220 = (C4220) getLastNonConfigurationInstance()) != null) {
            c3160 = c4220.f14000;
        }
        if (c3160 == null) {
            return null;
        }
        C4220 c4221 = new C4220();
        c4221.f14000 = c3160;
        return c4221;
    }

    @Override // p000.AbstractActivityC1700, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C4170 c4170 = this.f5665;
        if (c4170 != null) {
            c4170.m7368("setCurrentState");
            c4170.m7366(EnumC0458.f1653);
        }
        super.onSaveInstanceState(bundle);
        this.f5091.m4402(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f5099.iterator();
        while (it.hasNext()) {
            ((InterfaceC3281) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f5088.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC5568.m9353()) {
                Trace.beginSection(AbstractC5568.m9363("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            C1300 c1300 = (C1300) this.f5100.getValue();
            synchronized (c1300.f4464) {
                try {
                    c1300.f4463 = true;
                    Iterator it = c1300.f4462.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC4448) it.next()).mo449();
                    }
                    c1300.f4462.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m3180();
        this.f5093.m7579(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // p000.InterfaceC5833
    /* JADX INFO: renamed from: ۥؗ */
    public final C4397 mo640() {
        C4397 c4397 = new C4397(0);
        if (getApplication() != null) {
            c4397.m7687(C4800.f15837, getApplication());
        }
        c4397.m7687(AbstractC2765.f9171, this);
        c4397.m7687(AbstractC2765.f9173, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c4397.m7687(AbstractC2765.f9175, extras);
        }
        return c4397;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m3178(InterfaceC3281 interfaceC3281) {
        this.f5095.add(interfaceC3281);
    }

    @Override // p000.InterfaceC4507
    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC1434 mo110() {
        return this.f5665;
    }

    @Override // p000.InterfaceC3983
    /* JADX INFO: renamed from: ۥۗ */
    public final C2346 mo648() {
        return (C2346) this.f5091.f7785;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final C4023 m3179() {
        return (C4023) this.f5098.getValue();
    }

    @Override // p000.InterfaceC4680
    /* JADX INFO: renamed from: ۦؑ */
    public final C3160 mo651() {
        if (getApplication() == null) {
            C1078.m2276("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        C3160 c3160 = this.f5089;
        if (c3160 != null) {
            return c3160;
        }
        C4220 c4220 = (C4220) getLastNonConfigurationInstance();
        if (c4220 != null) {
            this.f5089 = c4220.f14000;
        }
        C3160 c3161 = this.f5089;
        if (c3161 != null) {
            return c3161;
        }
        C3160 c3162 = new C3160();
        this.f5089 = c3162;
        return c3162;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m3180() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(R.id.report_drawn, this);
        getWindow().getDecorView().setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m3181(InterfaceC1896 interfaceC1896) {
        C3225 c3225 = this.f5103;
        if (((AbstractActivityC1500) c3225.f10838) != null) {
            interfaceC1896.mo632();
        }
        ((CopyOnWriteArraySet) c3225.f10839).add(interfaceC1896);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m3180();
        this.f5093.m7579(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m3180();
        this.f5093.m7579(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.f5101) {
            return;
        }
        Iterator it = this.f5087.iterator();
        while (it.hasNext()) {
            ((InterfaceC3281) it.next()).accept(new C5842(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.f5092) {
            return;
        }
        Iterator it = this.f5086.iterator();
        while (it.hasNext()) {
            ((InterfaceC3281) it.next()).accept(new C5882(z));
        }
    }
}
