package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦۗؔۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC4964 extends DialogC2438 implements DialogInterface, InterfaceC0125 {

    /* JADX INFO: renamed from: ۥَ */
    public LayoutInflaterFactory2C1852 f16415;

    /* JADX INFO: renamed from: ۥٖ */
    public final C0267 f16416;

    /* JADX INFO: renamed from: ۦٗ */
    public final C4865 f16417;

    /* JADX WARN: Type inference failed for: r2v2, types: [ۥؒؖؔؗ] */
    public DialogInterfaceC4964(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iM8344 = m8344(contextThemeWrapper, i);
        if (iM8344 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iM8344;
        }
        super(contextThemeWrapper, i2);
        this.f16416 = new InterfaceC0608() { // from class: ۥؒؖؔؗ
            @Override // p000.InterfaceC0608
            /* JADX INFO: renamed from: ۥۣ */
            public final boolean mo547(KeyEvent keyEvent) {
                return this.f965.m8347(keyEvent);
            }
        };
        AbstractC3533 abstractC3533M8348 = m8348();
        if (iM8344 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iM8344 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C1852) abstractC3533M8348).f6172 = iM8344;
        abstractC3533M8348.mo3642();
        this.f16417 = new C4865(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static int m8344(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p000.DialogC2438, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m4551();
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = (LayoutInflaterFactory2C1852) m8348();
        layoutInflaterFactory2C1852.m3650();
        ((ViewGroup) layoutInflaterFactory2C1852.f6187.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C1852.f6144.m9580(layoutInflaterFactory2C1852.f6147.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m8348().mo3645();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0186.m413(this.f16416, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = (LayoutInflaterFactory2C1852) m8348();
        layoutInflaterFactory2C1852.m3650();
        return layoutInflaterFactory2C1852.f6147.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = (LayoutInflaterFactory2C1852) m8348();
        if (layoutInflaterFactory2C1852.f6170 != null) {
            layoutInflaterFactory2C1852.m3640();
            layoutInflaterFactory2C1852.f6170.getClass();
            layoutInflaterFactory2C1852.m3655(0);
        }
    }

    @Override // p000.DialogC2438, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        m8345(bundle);
        C4865 c4865 = this.f16417;
        c4865.f16009.setContentView(c4865.f16005);
        Context context = c4865.f16011;
        Window window = c4865.f16001;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupM8223 = C4865.m8223(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM8224 = C4865.m8223(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM8225 = C4865.m8223(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c4865.f16017 = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c4865.f16017.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM8224.findViewById(android.R.id.message);
        c4865.f16014 = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c4865.f16017.removeView(c4865.f16014);
            if (c4865.f16003 != null) {
                ViewGroup viewGroup2 = (ViewGroup) c4865.f16017.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c4865.f16017);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c4865.f16003, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupM8224.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupM8225.findViewById(android.R.id.button1);
        c4865.f16004 = button;
        ViewOnClickListenerC3684 viewOnClickListenerC3684 = c4865.f16008;
        button.setOnClickListener(viewOnClickListenerC3684);
        boolean zIsEmpty = TextUtils.isEmpty(null);
        Button button2 = c4865.f16004;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText((CharSequence) null);
            c4865.f16004.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupM8225.findViewById(android.R.id.button2);
        c4865.f16019 = button3;
        button3.setOnClickListener(viewOnClickListenerC3684);
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        Button button4 = c4865.f16019;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((CharSequence) null);
            c4865.f16019.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupM8225.findViewById(android.R.id.button3);
        c4865.f16010 = button5;
        button5.setOnClickListener(viewOnClickListenerC3684);
        boolean zIsEmpty3 = TextUtils.isEmpty(null);
        Button button6 = c4865.f16010;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            c4865.f16010.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = c4865.f16004;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = c4865.f16019;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = c4865.f16010;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM8225.setVisibility(8);
        }
        if (c4865.f16020 != null) {
            viewGroupM8223.addView(c4865.f16020, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c4865.f16018 = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c4865.f16012) || !c4865.f16016) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c4865.f16018.setVisibility(8);
                viewGroupM8223.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c4865.f16013 = textView2;
                textView2.setText(c4865.f16012);
                Drawable drawable = c4865.f16015;
                if (drawable != null) {
                    c4865.f16018.setImageDrawable(drawable);
                } else {
                    c4865.f16013.setPadding(c4865.f16018.getPaddingLeft(), c4865.f16018.getPaddingTop(), c4865.f16018.getPaddingRight(), c4865.f16018.getPaddingBottom());
                    c4865.f16018.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupM8223 == null || viewGroupM8223.getVisibility() == 8) ? 0 : 1;
        boolean z2 = viewGroupM8225.getVisibility() != 8;
        if (!z2 && (viewFindViewById = viewGroupM8224.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = c4865.f16017;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c4865.f16003 != null ? viewGroupM8223.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM8224.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c4865.f16003;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f1, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f0);
        }
        if (!z) {
            View view = c4865.f16003;
            if (view == null) {
                view = c4865.f16017;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC3608.f12013;
                view.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM8224.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM8224.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c4865.f16003;
        if (alertController$RecycleListView2 == null || (listAdapter = c4865.f16023) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c4865.f16022;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f16417.f16017;
        if (nestedScrollView == null || !nestedScrollView.m69(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f16417.f16017;
        if (nestedScrollView == null || !nestedScrollView.m69(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // p000.DialogC2438, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = (LayoutInflaterFactory2C1852) m8348();
        layoutInflaterFactory2C1852.m3640();
        C4075 c4075 = layoutInflaterFactory2C1852.f6170;
        if (c4075 != null) {
            c4075.f13574 = false;
            C4799 c4799 = c4075.f13569;
            if (c4799 != null) {
                c4799.m8177();
            }
        }
    }

    @Override // p000.DialogC2438, android.app.Dialog
    public final void setContentView(int i) {
        m4551();
        m8348().mo3663(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m8348().mo3658(getContext().getString(i));
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m8345(Bundle bundle) {
        m8348().mo3653();
        super.onCreate(bundle);
        m8348().mo3642();
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m8346(CharSequence charSequence) {
        super.setTitle(charSequence);
        m8348().mo3658(charSequence);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final boolean m8347(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final AbstractC3533 m8348() {
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = this.f16415;
        if (layoutInflaterFactory2C1852 != null) {
            return layoutInflaterFactory2C1852;
        }
        ExecutorC2205 executorC2205 = AbstractC3533.f11724;
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1853 = new LayoutInflaterFactory2C1852(getContext(), getWindow(), this, this);
        this.f16415 = layoutInflaterFactory2C1853;
        return layoutInflaterFactory2C1853;
    }

    @Override // p000.DialogC2438, android.app.Dialog
    public final void setContentView(View view) {
        m4551();
        m8348().mo3659(view);
    }

    @Override // p000.DialogC2438, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m4551();
        m8348().mo3664(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m8346(charSequence);
        C4865 c4865 = this.f16417;
        c4865.f16012 = charSequence;
        TextView textView = c4865.f16013;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
