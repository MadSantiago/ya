package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥٌ۟ؓٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class DialogC2438 extends Dialog implements InterfaceC4507, InterfaceC3983 {

    /* JADX INFO: renamed from: ۥْ */
    public final C2432 f8110;

    /* JADX INFO: renamed from: ۥٓ */
    public final C2432 f8111;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2346 f8112;

    /* JADX INFO: renamed from: ۦۨ */
    public C4170 f8113;

    public DialogC2438(Context context, int i) {
        super(context, i);
        final int i2 = 0;
        this.f8112 = new C2346(new C5140(this, new C0463(i2, this)), 6);
        this.f8110 = new C2432(new InterfaceC4448(this) { // from class: ۥؙؖۧؕ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ DialogC2438 f2705;

            {
                this.f2705 = this;
            }

            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i3 = i2;
                DialogC2438 dialogC2438 = this.f2705;
                switch (i3) {
                    case 0:
                        C4429 c4429 = new C4429();
                        dialogC2438.m4549().m7196().f13504.m3125(c4429);
                        return c4429;
                    default:
                        return new C4023(new RunnableC0029(9, dialogC2438));
                }
            }
        });
        final int i3 = 1;
        this.f8111 = new C2432(new InterfaceC4448(this) { // from class: ۥؙؖۧؕ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ DialogC2438 f2705;

            {
                this.f2705 = this;
            }

            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i4 = i3;
                DialogC2438 dialogC2438 = this.f2705;
                switch (i4) {
                    case 0:
                        C4429 c4429 = new C4429();
                        dialogC2438.m4549().m7196().f13504.m3125(c4429);
                        return c4429;
                    default:
                        return new C4023(new RunnableC0029(9, dialogC2438));
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final void m4548(DialogC2438 dialogC2438) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m4551();
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((C4429) this.f8110.getValue()).m2864();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            m4549().m7195(getOnBackInvokedDispatcher());
        }
        this.f8112.m4398(bundle);
        m4550().m7369(EnumC1924.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        this.f8112.m4402(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        m4550().m7369(EnumC1924.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m4550().m7369(EnumC1924.ON_DESTROY);
        this.f8113 = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m4551();
        super.setContentView(i);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C4023 m4549() {
        return (C4023) this.f8111.getValue();
    }

    @Override // p000.InterfaceC4507
    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC1434 mo110() {
        return m4550();
    }

    @Override // p000.InterfaceC3983
    /* JADX INFO: renamed from: ۥۗ */
    public final C2346 mo648() {
        return (C2346) this.f8112.f7785;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C4170 m4550() {
        C4170 c4170 = this.f8113;
        if (c4170 != null) {
            return c4170;
        }
        C4170 c4171 = new C4170(this, true);
        this.f8113 = c4171;
        return c4171;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m4551() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m4551();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m4551();
        super.setContentView(view, layoutParams);
    }
}
