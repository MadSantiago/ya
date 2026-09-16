package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦۦؕ۠ؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC5767 implements Window.Callback {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ LayoutInflaterFactory2C1852 f19008;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f19009;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f19010;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f19011;

    /* JADX INFO: renamed from: ۦۨ */
    public final Window.Callback f19012;

    public WindowCallbackC5767(LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852, Window.Callback callback) {
        this.f19008 = layoutInflaterFactory2C1852;
        if (callback != null) {
            this.f19012 = callback;
        } else {
            C1078.m2272("Window callback may not be null");
            throw null;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f19012.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f19009;
        Window.Callback callback = this.f19012;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f19008.m3661(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C4626 c4626;
        boolean zM3651;
        MenuC4903 menuC4903;
        boolean zPerformShortcut;
        if (!this.f19012.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = this.f19008;
            layoutInflaterFactory2C1852.m3640();
            C4075 c4075 = layoutInflaterFactory2C1852.f6170;
            if (c4075 == null) {
                c4626 = layoutInflaterFactory2C1852.f6168;
                if (c4626 != null || !layoutInflaterFactory2C1852.m3651(c4626, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C1852.f6168 == null) {
                        C4626 c4626M3641 = layoutInflaterFactory2C1852.m3641(0);
                        layoutInflaterFactory2C1852.m3657(c4626M3641, keyEvent);
                        zM3651 = layoutInflaterFactory2C1852.m3651(c4626M3641, keyEvent.getKeyCode(), keyEvent);
                        c4626M3641.f15268 = false;
                        if (zM3651) {
                        }
                    }
                    return false;
                }
                C4626 c4627 = layoutInflaterFactory2C1852.f6168;
                if (c4627 != null) {
                    c4627.f15264 = true;
                    return true;
                }
            } else {
                C3795 c3795 = c4075.f13585;
                if (c3795 == null || (menuC4903 = c3795.f12601) == null) {
                    zPerformShortcut = false;
                } else {
                    menuC4903.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = menuC4903.performShortcut(keyCode, keyEvent, 0);
                }
                if (!zPerformShortcut) {
                    c4626 = layoutInflaterFactory2C1852.f6168;
                    if (c4626 != null) {
                        if (layoutInflaterFactory2C1852.f6168 == null) {
                            C4626 c4626M3642 = layoutInflaterFactory2C1852.m3641(0);
                            layoutInflaterFactory2C1852.m3657(c4626M3642, keyEvent);
                            zM3651 = layoutInflaterFactory2C1852.m3651(c4626M3642, keyEvent.getKeyCode(), keyEvent);
                            c4626M3642.f15268 = false;
                            if (zM3651) {
                            }
                        }
                        return false;
                    }
                    if (layoutInflaterFactory2C1852.f6168 == null) {
                        C4626 c4626M3643 = layoutInflaterFactory2C1852.m3641(0);
                        layoutInflaterFactory2C1852.m3657(c4626M3643, keyEvent);
                        zM3651 = layoutInflaterFactory2C1852.m3651(c4626M3643, keyEvent.getKeyCode(), keyEvent);
                        c4626M3643.f15268 = false;
                        if (zM3651) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f19012.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f19012.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f19012.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f19012.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f19012.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f19012.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f19011) {
            this.f19012.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC4903)) {
            return this.f19012.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f19012.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f19012.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f19012.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        m9579(i, menu);
        if (i == 108) {
            LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = this.f19008;
            layoutInflaterFactory2C1852.m3640();
            C4075 c4075 = layoutInflaterFactory2C1852.f6170;
            if (c4075 != null) {
                ArrayList arrayList = c4075.f13581;
                if (true != c4075.f13580) {
                    c4075.f13580 = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        C0178.m382();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f19010) {
            this.f19012.onPanelClosed(i, menu);
            return;
        }
        m9578(i, menu);
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = this.f19008;
        if (i != 108) {
            if (i == 0) {
                C4626 c4626M3641 = layoutInflaterFactory2C1852.m3641(i);
                if (c4626M3641.f15265) {
                    layoutInflaterFactory2C1852.m3644(c4626M3641, false);
                    return;
                }
                return;
            }
            return;
        }
        layoutInflaterFactory2C1852.m3640();
        C4075 c4075 = layoutInflaterFactory2C1852.f6170;
        if (c4075 != null) {
            ArrayList arrayList = c4075.f13581;
            if (c4075.f13580) {
                c4075.f13580 = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                C0178.m382();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        AbstractC1847.m3631(this.f19012, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC4903 menuC4903 = menu instanceof MenuC4903 ? (MenuC4903) menu : null;
        if (i == 0 && menuC4903 == null) {
            return false;
        }
        if (menuC4903 != null) {
            menuC4903.f16187 = true;
        }
        boolean zOnPreparePanel = this.f19012.onPreparePanel(i, view, menu);
        if (menuC4903 != null) {
            menuC4903.f16187 = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC4903 menuC4903 = this.f19008.m3641(0).f15261;
        if (menuC4903 != null) {
            m9581(list, menuC4903, i);
        } else {
            m9581(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC4874.m8227(this.f19012, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f19012.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f19012.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = this.f19008;
        Context context = layoutInflaterFactory2C1852.f6156;
        if (i != 0) {
            return AbstractC4874.m8226(this.f19012, callback, i);
        }
        C1489 c1489 = new C1489(context, callback);
        AbstractC3305 abstractC3305 = layoutInflaterFactory2C1852.f6176;
        if (abstractC3305 != null) {
            abstractC3305.mo6070();
        }
        C5002 c5002 = new C5002(7, layoutInflaterFactory2C1852, c1489);
        layoutInflaterFactory2C1852.m3640();
        C4075 c4075 = layoutInflaterFactory2C1852.f6170;
        int i2 = 1;
        if (c4075 != null) {
            C3795 c3795 = c4075.f13585;
            if (c3795 != null) {
                c3795.mo6070();
            }
            c4075.f13568.setHideOnContentScrollEnabled(false);
            c4075.f13571.m12();
            C3795 c3796 = new C3795(c4075, c4075.f13571.getContext(), c5002);
            MenuC4903 menuC4903 = c3796.f12601;
            menuC4903.m8302();
            try {
                boolean zM3137 = ((C1489) c3796.f12599.f16551).m3137(c3796, menuC4903);
                menuC4903.m8310();
                if (zM3137) {
                    c4075.f13585 = c3796;
                    c3796.mo6074();
                    c4075.f13571.m11(c3796);
                    c4075.m7262(true);
                } else {
                    c3796 = null;
                }
                layoutInflaterFactory2C1852.f6176 = c3796;
            } catch (Throwable th) {
                menuC4903.m8310();
                throw th;
            }
        }
        if (layoutInflaterFactory2C1852.f6176 == null) {
            C1551 c1551 = layoutInflaterFactory2C1852.f6182;
            if (c1551 != null) {
                c1551.m3299();
            }
            AbstractC3305 abstractC3306 = layoutInflaterFactory2C1852.f6176;
            if (abstractC3306 != null) {
                abstractC3306.mo6070();
            }
            if (layoutInflaterFactory2C1852.f6169 == null) {
                if (layoutInflaterFactory2C1852.f6149) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        C5260 c5260 = new C5260(context, 0);
                        c5260.getTheme().setTo(themeNewTheme);
                        context = c5260;
                    }
                    layoutInflaterFactory2C1852.f6169 = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C1852.f6177 = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    layoutInflaterFactory2C1852.f6177.setContentView(layoutInflaterFactory2C1852.f6169);
                    layoutInflaterFactory2C1852.f6177.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C1852.f6169.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C1852.f6177.setHeight(-2);
                    layoutInflaterFactory2C1852.f6180 = new RunnableC4929(layoutInflaterFactory2C1852, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C1852.f6187.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C1852.m3640();
                        C4075 c4076 = layoutInflaterFactory2C1852.f6170;
                        Context contextM7261 = c4076 != null ? c4076.m7261() : null;
                        if (contextM7261 != null) {
                            context = contextM7261;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        layoutInflaterFactory2C1852.f6169 = (ActionBarContextView) viewStubCompat.m55();
                    }
                }
            }
            if (layoutInflaterFactory2C1852.f6169 != null) {
                C1551 c1552 = layoutInflaterFactory2C1852.f6182;
                if (c1552 != null) {
                    c1552.m3299();
                }
                layoutInflaterFactory2C1852.f6169.m12();
                Context context2 = layoutInflaterFactory2C1852.f6169.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C1852.f6169;
                C5605 c5605 = new C5605();
                c5605.f18457 = context2;
                c5605.f18458 = actionBarContextView;
                c5605.f18456 = c5002;
                MenuC4903 menuC4904 = new MenuC4903(actionBarContextView.getContext());
                menuC4904.f16184 = 1;
                c5605.f18461 = menuC4904;
                menuC4904.f16174 = c5605;
                if (((C1489) c5002.f16551).m3137(c5605, menuC4904)) {
                    c5605.mo6074();
                    layoutInflaterFactory2C1852.f6169.m11(c5605);
                    layoutInflaterFactory2C1852.f6176 = c5605;
                    boolean z = layoutInflaterFactory2C1852.f6145 && (viewGroup = layoutInflaterFactory2C1852.f6187) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = layoutInflaterFactory2C1852.f6169;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        C1551 c1551M6432 = AbstractC3608.m6432(layoutInflaterFactory2C1852.f6169);
                        c1551M6432.m3300(1.0f);
                        layoutInflaterFactory2C1852.f6182 = c1551M6432;
                        c1551M6432.m3301(new C2751(i2, layoutInflaterFactory2C1852));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        layoutInflaterFactory2C1852.f6169.setVisibility(0);
                        if (layoutInflaterFactory2C1852.f6169.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C1852.f6169.getParent();
                            WeakHashMap weakHashMap = AbstractC3608.f12013;
                            view.requestApplyInsets();
                        }
                    }
                    if (layoutInflaterFactory2C1852.f6177 != null) {
                        layoutInflaterFactory2C1852.f6147.getDecorView().post(layoutInflaterFactory2C1852.f6180);
                    }
                } else {
                    layoutInflaterFactory2C1852.f6176 = null;
                }
            }
            layoutInflaterFactory2C1852.m3654();
            layoutInflaterFactory2C1852.f6176 = layoutInflaterFactory2C1852.f6176;
        }
        layoutInflaterFactory2C1852.m3654();
        AbstractC3305 abstractC3307 = layoutInflaterFactory2C1852.f6176;
        if (abstractC3307 != null) {
            return c1489.m3139(abstractC3307);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m9578(int i, Menu menu) {
        this.f19012.onPanelClosed(i, menu);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m9579(int i, Menu menu) {
        return this.f19012.onMenuOpened(i, menu);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m9580(Window.Callback callback) {
        try {
            this.f19011 = true;
            callback.onContentChanged();
        } finally {
            this.f19011 = false;
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m9581(List list, Menu menu, int i) {
        AbstractC5531.m9207(this.f19012, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f19012.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
