package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۥٜٜ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C1852 extends AbstractC3533 implements InterfaceC0614, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: ۥٗ */
    public static final C0796 f6141 = new C0796(0);

    /* JADX INFO: renamed from: ۦٔ */
    public static final int[] f6142 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: ۦۦ */
    public static final boolean f6143 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: ۥؓ */
    public WindowCallbackC5767 f6144;

    /* JADX INFO: renamed from: ۥؔ */
    public boolean f6145;

    /* JADX INFO: renamed from: ۥؕ */
    public boolean f6146;

    /* JADX INFO: renamed from: ۥؖ */
    public Window f6147;

    /* JADX INFO: renamed from: ۥؙ */
    public boolean f6148;

    /* JADX INFO: renamed from: ۥؚ */
    public boolean f6149;

    /* JADX INFO: renamed from: ۥً */
    public C3837 f6150;

    /* JADX INFO: renamed from: ۥٌ */
    public OnBackInvokedDispatcher f6151;

    /* JADX INFO: renamed from: ۥِ */
    public boolean f6153;

    /* JADX INFO: renamed from: ۥٕ */
    public ActionBarOverlayLayout f6154;

    /* JADX INFO: renamed from: ۥ٘ */
    public View f6155;

    /* JADX INFO: renamed from: ۥٙ */
    public final Context f6156;

    /* JADX INFO: renamed from: ۥٚ */
    public boolean f6157;

    /* JADX INFO: renamed from: ۥٛ */
    public boolean f6158;

    /* JADX INFO: renamed from: ۥٝ */
    public boolean f6159;

    /* JADX INFO: renamed from: ۥٞ */
    public C2467 f6160;

    /* JADX INFO: renamed from: ۥۘ */
    public boolean f6161;

    /* JADX INFO: renamed from: ۥۙ */
    public C5050 f6162;

    /* JADX INFO: renamed from: ۥۚ */
    public OnBackInvokedCallback f6163;

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f6164;

    /* JADX INFO: renamed from: ۥۡ */
    public boolean f6165;

    /* JADX INFO: renamed from: ۥۢ */
    public final int f6166;

    /* JADX INFO: renamed from: ۥۤ */
    public boolean f6167;

    /* JADX INFO: renamed from: ۥۥ */
    public C4626 f6168;

    /* JADX INFO: renamed from: ۥۦ */
    public ActionBarContextView f6169;

    /* JADX INFO: renamed from: ۥۧ */
    public C4075 f6170;

    /* JADX INFO: renamed from: ۥۨ */
    public boolean f6171;

    /* JADX INFO: renamed from: ۦ */
    public int f6172;

    /* JADX INFO: renamed from: ۦؒ */
    public boolean f6173;

    /* JADX INFO: renamed from: ۦؓ */
    public int f6174;

    /* JADX INFO: renamed from: ۦؔ */
    public Configuration f6175;

    /* JADX INFO: renamed from: ۦؖ */
    public AbstractC3305 f6176;

    /* JADX INFO: renamed from: ۦؗ */
    public PopupWindow f6177;

    /* JADX INFO: renamed from: ۦؙ */
    public C5822 f6178;

    /* JADX INFO: renamed from: ۦَ */
    public Rect f6179;

    /* JADX INFO: renamed from: ۦُ */
    public RunnableC4929 f6180;

    /* JADX INFO: renamed from: ۦٕ */
    public final Object f6181;

    /* JADX INFO: renamed from: ۦٚ */
    public CharSequence f6183;

    /* JADX INFO: renamed from: ۦٝ */
    public int f6184;

    /* JADX INFO: renamed from: ۦٞ */
    public boolean f6185;

    /* JADX INFO: renamed from: ۦٟ */
    public C2467 f6186;

    /* JADX INFO: renamed from: ۦۜ */
    public ViewGroup f6187;

    /* JADX INFO: renamed from: ۦ۠ */
    public boolean f6188;

    /* JADX INFO: renamed from: ۦۢ */
    public C3141 f6189;

    /* JADX INFO: renamed from: ۦۣ */
    public TextView f6190;

    /* JADX INFO: renamed from: ۦۤ */
    public Rect f6191;

    /* JADX INFO: renamed from: ۦۧ */
    public C4626[] f6192;

    /* JADX INFO: renamed from: ۦٖ */
    public C1551 f6182 = null;

    /* JADX INFO: renamed from: ۥٍ */
    public final RunnableC4929 f6152 = new RunnableC4929(this, 0);

    public LayoutInflaterFactory2C1852(Context context, Window window, InterfaceC0125 interfaceC0125, Object obj) {
        AbstractActivityC2747 abstractActivityC2747 = null;
        this.f6166 = -100;
        this.f6156 = context;
        this.f6181 = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC2747)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC2747 = (AbstractActivityC2747) context;
                    break;
                }
            }
            if (abstractActivityC2747 != null) {
                this.f6166 = ((LayoutInflaterFactory2C1852) abstractActivityC2747.m5101()).f6166;
            }
        }
        if (this.f6166 == -100) {
            String name = this.f6181.getClass().getName();
            C0796 c0796 = f6141;
            Integer num = (Integer) c0796.get(name);
            if (num != null) {
                this.f6166 = num.intValue();
                c0796.remove(this.f6181.getClass().getName());
            }
        }
        if (window != null) {
            m3667(window);
        }
        C3465.m6240();
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static Configuration m3638(Context context, int i, C1257 c1257, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c1257 != null) {
            AbstractC1937.m3802(configuration2, c1257);
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static C1257 m3639(Context context) {
        C1257 c1257;
        C1257 c1258;
        if (Build.VERSION.SDK_INT >= 33 || (c1257 = AbstractC3533.f11717) == null) {
            return null;
        }
        C3446 c3446 = c1257.f4324;
        C1257 c1257M3800 = AbstractC1937.m3800(context.getApplicationContext().getResources().getConfiguration());
        if (c3446.f11452.isEmpty()) {
            c1258 = C1257.f4323;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < c1257M3800.f4324.f11452.size() + c3446.f11452.size()) {
                Locale locale = i < c3446.f11452.size() ? c3446.f11452.get(i) : c1257M3800.f4324.f11452.get(i - c3446.f11452.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            c1258 = new C1257(new C3446(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return c1258.f4324.f11452.isEmpty() ? c1257M3800 : c1258;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c5810;
        C3141 c3141 = this.f6189;
        View view2 = null;
        if (c3141 == null) {
            int[] iArr = AbstractC5618.f18524;
            Context context2 = this.f6156;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                c3141 = new C3141();
                this.f6189 = c3141;
            } else {
                try {
                    c3141 = (C3141) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.f6189 = c3141;
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    c3141 = new C3141();
                    this.f6189 = c3141;
                }
            }
        }
        int i = AbstractC4569.f15076;
        c3141.getClass();
        int i2 = 0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC5618.f18525, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context c5260 = (resourceId == 0 || ((context instanceof C5260) && ((C5260) context).f17348 == resourceId)) ? context : new C5260(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                c5810 = new C5810(c5260, attributeSet);
                break;
            case 1:
                c5810 = new C2839(c5260, attributeSet);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                c5810 = new C2893(c5260, attributeSet);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                c5810 = c3141.mo132(c5260, attributeSet);
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                c5810 = new C1685(c5260, attributeSet, ru.bluecat.yandexmapspatcher.R.attr.imageButtonStyle);
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                c5810 = new C0296(c5260, attributeSet);
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                c5810 = new C3689(c5260, attributeSet);
                break;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                c5810 = c3141.mo135(c5260, attributeSet);
                break;
            case 8:
                c5810 = new C1424(c5260, attributeSet);
                break;
            case 9:
                c5810 = new C0532(c5260, attributeSet, 0);
                break;
            case 10:
                c5810 = c3141.mo134(c5260, attributeSet);
                break;
            case 11:
                c5810 = c3141.mo131(c5260, attributeSet);
                break;
            case 12:
                c5810 = new C5396(c5260, attributeSet);
                break;
            case 13:
                c5810 = c3141.mo133(c5260, attributeSet);
                break;
            default:
                c5810 = null;
                break;
        }
        if (c5810 == null && context != c5260) {
            Object[] objArr = c3141.f10608;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c5260;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C3141.f10607;
                        if (i3 < 3) {
                            View viewM5817 = c3141.m5817(c5260, str, strArr[i3]);
                            if (viewM5817 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewM5817;
                            } else {
                                i3++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewM5818 = c3141.m5817(c5260, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewM5818;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            c5810 = view2;
        }
        if (c5810 != null) {
            Context context3 = c5810.getContext();
            if ((context3 instanceof ContextWrapper) && c5810.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C3141.f10601);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c5810.setOnClickListener(new ViewOnClickListenerC4677(c5810, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            int i4 = 28;
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = c5260.obtainStyledAttributes(attributeSet, C3141.f10606);
                Class<Boolean> cls = Boolean.class;
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = AbstractC3608.f12013;
                    new C1932(ru.bluecat.yandexmapspatcher.R.id.tag_accessibility_heading, cls, i2, i4, 2).m8334(c5810, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = c5260.obtainStyledAttributes(attributeSet, C3141.f10602);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    AbstractC3608.m6436(c5810, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = c5260.obtainStyledAttributes(attributeSet, C3141.f10603);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = AbstractC3608.f12013;
                    new C1932(ru.bluecat.yandexmapspatcher.R.id.tag_screen_reader_focusable, cls, i2, i4, 0).m8334(c5810, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return c5810;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final void m3640() {
        C4075 c4075;
        m3650();
        if (this.f6173 && (c4075 = this.f6170) == null) {
            Object obj = this.f6181;
            if (obj instanceof Activity) {
                c4075 = new C4075((Activity) obj, this.f6159);
                this.f6170 = c4075;
            } else if (obj instanceof Dialog) {
                c4075 = new C4075((Dialog) obj);
                this.f6170 = c4075;
            }
            if (c4075 != null) {
                c4075.m7263(this.f6157);
            }
        }
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final C4626 m3641(int i) {
        C4626[] c4626Arr = this.f6192;
        if (c4626Arr == null || c4626Arr.length <= i) {
            C4626[] c4626Arr2 = new C4626[i + 1];
            if (c4626Arr != null) {
                System.arraycopy(c4626Arr, 0, c4626Arr2, 0, c4626Arr.length);
            }
            this.f6192 = c4626Arr2;
            c4626Arr = c4626Arr2;
        }
        C4626 c4626 = c4626Arr[i];
        if (c4626 != null) {
            return c4626;
        }
        C4626 c4627 = new C4626();
        c4627.f15262 = i;
        c4627.f15270 = false;
        c4626Arr[i] = c4627;
        return c4627;
    }

    @Override // p000.AbstractC3533
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3642() {
        String strM8626;
        this.f6188 = true;
        m3665(false, true);
        m3660();
        Object obj = this.f6181;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM8626 = C5063.m8626(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM8626 = null;
            }
            if (strM8626 != null) {
                C4075 c4075 = this.f6170;
                if (c4075 == null) {
                    this.f6157 = true;
                } else {
                    c4075.m7263(true);
                }
            }
            synchronized (AbstractC3533.f11722) {
                AbstractC3533.m6322(this);
                AbstractC3533.f11721.add(new WeakReference(this));
            }
        }
        this.f6175 = new Configuration(this.f6156.getResources().getConfiguration());
        this.f6153 = true;
    }

    /* JADX INFO: renamed from: ۥً */
    public final int m3643(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            C1078.m2276("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        C2467 c2467 = this.f6186;
                        if (c2467 == null) {
                            c2467 = new C2467(this, context);
                            this.f6186 = c2467;
                        }
                        return c2467.mo4628();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m3649(context).mo4628();
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m3644(C4626 c4626, boolean z) {
        C3846 c3846;
        ActionBarOverlayLayout actionBarOverlayLayout;
        C4718 c4718;
        if (z && c4626.f15262 == 0 && (actionBarOverlayLayout = this.f6154) != null) {
            actionBarOverlayLayout.m26();
            ActionMenuView actionMenuView = ((C0251) actionBarOverlayLayout.f68).f930.f159;
            if (actionMenuView != null && (c4718 = actionMenuView.f96) != null && c4718.m8051()) {
                m3647(c4626.f15261);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f6156.getSystemService("window");
        if (windowManager != null && c4626.f15265 && (c3846 = c4626.f15258) != null) {
            windowManager.removeView(c3846);
            if (z) {
                m3646(c4626.f15262, c4626, null);
            }
        }
        c4626.f15268 = false;
        c4626.f15264 = false;
        c4626.f15265 = false;
        c4626.f15259 = null;
        c4626.f15270 = true;
        if (this.f6168 == c4626) {
            this.f6168 = null;
        }
        if (c4626.f15262 == 0) {
            m3654();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // p000.AbstractC3533
    /* JADX INFO: renamed from: ۥُ */
    public final void mo3645() {
        if (this.f6181 instanceof Activity) {
            synchronized (AbstractC3533.f11722) {
                AbstractC3533.m6322(this);
            }
        }
        if (this.f6146) {
            this.f6147.getDecorView().removeCallbacks(this.f6152);
        }
        this.f6161 = true;
        if (this.f6166 != -100) {
            Object obj = this.f6181;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f6141.put(this.f6181.getClass().getName(), Integer.valueOf(this.f6166));
            } else {
                f6141.remove(this.f6181.getClass().getName());
            }
        } else {
            f6141.remove(this.f6181.getClass().getName());
        }
        C2467 c2467 = this.f6160;
        if (c2467 != null) {
            c2467.m5979();
        }
        C2467 c2468 = this.f6186;
        if (c2468 != null) {
            c2468.m5979();
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public final void m3646(int i, C4626 c4626, MenuC4903 menuC4903) {
        if (menuC4903 == null) {
            if (c4626 == null && i >= 0) {
                C4626[] c4626Arr = this.f6192;
                if (i < c4626Arr.length) {
                    c4626 = c4626Arr[i];
                }
            }
            if (c4626 != null) {
                menuC4903 = c4626.f15261;
            }
        }
        if ((c4626 == null || c4626.f15265) && !this.f6161) {
            WindowCallbackC5767 windowCallbackC5767 = this.f6144;
            Window.Callback callback = this.f6147.getCallback();
            windowCallbackC5767.getClass();
            try {
                windowCallbackC5767.f19010 = true;
                callback.onPanelClosed(i, menuC4903);
            } finally {
                windowCallbackC5767.f19010 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m3647(MenuC4903 menuC4903) {
        C4718 c4718;
        if (this.f6165) {
            return;
        }
        this.f6165 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6154;
        actionBarOverlayLayout.m26();
        ActionMenuView actionMenuView = ((C0251) actionBarOverlayLayout.f68).f930.f159;
        if (actionMenuView != null && (c4718 = actionMenuView.f96) != null) {
            c4718.m8052();
            C0911 c0911 = c4718.f15564;
            if (c0911 != null && c0911.m4342()) {
                c0911.f7607.dismiss();
            }
        }
        Window.Callback callback = this.f6147.getCallback();
        if (callback != null && !this.f6161) {
            callback.onPanelClosed(108, menuC4903);
        }
        this.f6165 = false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016f, code lost:
    
        if (r6.getCount() > 0) goto L88;
     */
    /* JADX INFO: renamed from: ۥٕ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3648(p000.C4626 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C1852.m3648(ۦٛؕؗۜ, android.view.KeyEvent):void");
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final AbstractC0057 m3649(Context context) {
        C2467 c2467 = this.f6160;
        if (c2467 == null) {
            C5460 c5460 = C5460.f17996;
            if (c5460 == null) {
                Context applicationContext = context.getApplicationContext();
                c5460 = new C5460(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
                C5460.f17996 = c5460;
            }
            c2467 = new C2467(this, c5460);
            this.f6160 = c2467;
        }
        return c2467;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m3650() {
        ViewGroup viewGroup;
        if (this.f6145) {
            return;
        }
        Context context = this.f6156;
        int[] iArr = AbstractC5618.f18524;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            C1078.m2276("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo3652(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo3652(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo3652(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo3652(10);
        }
        this.f6149 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m3660();
        this.f6147.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f6148) {
            viewGroup = this.f6164 ? (ViewGroup) layoutInflaterFrom.inflate(ru.bluecat.yandexmapspatcher.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(ru.bluecat.yandexmapspatcher.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f6149) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(ru.bluecat.yandexmapspatcher.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f6159 = false;
            this.f6173 = false;
        } else if (this.f6173) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(ru.bluecat.yandexmapspatcher.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C5260(context, typedValue.resourceId) : context).inflate(ru.bluecat.yandexmapspatcher.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(ru.bluecat.yandexmapspatcher.R.id.decor_content_parent);
            this.f6154 = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.f6147.getCallback());
            if (this.f6159) {
                this.f6154.m24(109);
            }
            if (this.f6158) {
                this.f6154.m24(2);
            }
            if (this.f6167) {
                this.f6154.m24(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f6173 + ", windowActionBarOverlay: " + this.f6159 + ", android:windowIsFloating: " + this.f6149 + ", windowActionModeOverlay: " + this.f6164 + ", windowNoTitle: " + this.f6148 + " }");
        }
        C5050 c5050 = new C5050(this);
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        AbstractC5039.m8554(viewGroup, c5050);
        if (this.f6154 == null) {
            this.f6190 = (TextView) viewGroup.findViewById(ru.bluecat.yandexmapspatcher.R.id.title);
        }
        boolean z = AbstractC4518.f14932;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(ru.bluecat.yandexmapspatcher.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f6147.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f6147.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C5822(this));
        this.f6187 = viewGroup;
        Object obj = this.f6181;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f6183;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6154;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                C4075 c4075 = this.f6170;
                if (c4075 != null) {
                    C0251 c0251 = (C0251) c4075.f13570;
                    if (!c0251.f937) {
                        Toolbar toolbar = c0251.f930;
                        c0251.f929 = title;
                        if ((c0251.f928 & 8) != 0) {
                            toolbar.setTitle(title);
                            if (c0251.f937) {
                                AbstractC3608.m6436(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f6190;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f6187.findViewById(R.id.content);
        View decorView = this.f6147.getDecorView();
        contentFrameLayout2.f110.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f6145 = true;
        C4626 c4626M3641 = m3641(0);
        if (this.f6161 || c4626M3641.f15261 != null) {
            return;
        }
        m3655(108);
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final boolean m3651(C4626 c4626, int i, KeyEvent keyEvent) {
        MenuC4903 menuC4903;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c4626.f15268 || m3657(c4626, keyEvent)) && (menuC4903 = c4626.f15261) != null) {
            return menuC4903.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    @Override // p000.AbstractC3533
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo3652(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f6148 && i == 108) {
            return false;
        }
        if (this.f6173 && i == 1) {
            this.f6173 = false;
        }
        if (i == 1) {
            m3656();
            this.f6148 = true;
            return true;
        }
        if (i == 2) {
            m3656();
            this.f6158 = true;
            return true;
        }
        if (i == 5) {
            m3656();
            this.f6167 = true;
            return true;
        }
        if (i == 10) {
            m3656();
            this.f6164 = true;
            return true;
        }
        if (i == 108) {
            m3656();
            this.f6173 = true;
            return true;
        }
        if (i != 109) {
            return this.f6147.requestFeature(i);
        }
        m3656();
        this.f6159 = true;
        return true;
    }

    @Override // p000.AbstractC3533
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3653() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f6156);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C1852) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final void m3654() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f6151 != null && (m3641(0).f15265 || this.f6176 != null)) {
                z = true;
            }
            if (z && this.f6163 == null) {
                this.f6163 = AbstractC1394.m2955(this.f6151, this);
            } else {
                if (z || (onBackInvokedCallback = this.f6163) == null) {
                    return;
                }
                AbstractC1394.m2954(this.f6151, onBackInvokedCallback);
                this.f6163 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m3655(int i) {
        this.f6174 = (1 << i) | this.f6174;
        if (this.f6146) {
            return;
        }
        View decorView = this.f6147.getDecorView();
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        decorView.postOnAnimation(this.f6152);
        this.f6146 = true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // p000.InterfaceC0614
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean mo1377(MenuC4903 menuC4903, MenuItem menuItem) {
        C4626 c4626;
        Window.Callback callback = this.f6147.getCallback();
        if (callback != null && !this.f6161) {
            MenuC4903 menuC4903Mo7310 = menuC4903.mo7310();
            C4626[] c4626Arr = this.f6192;
            int length = c4626Arr != null ? c4626Arr.length : 0;
            for (int i = 0; i < length; i++) {
                c4626 = c4626Arr[i];
                if (c4626 != null && c4626.f15261 == menuC4903Mo7310) {
                    if (c4626 != null) {
                        return callback.onMenuItemSelected(c4626.f15262, menuItem);
                    }
                }
            }
            c4626 = null;
            if (c4626 != null) {
                return callback.onMenuItemSelected(c4626.f15262, menuItem);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final void m3656() {
        if (this.f6145) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ce A[PHI: r6
  0x00ce: PHI (r6v2 ۦۖؓۢۖ) = (r6v1 ۦۖؓۢۖ), (r6v8 ۦۖؓۢۖ) binds: [B:31:0x004c, B:57:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x0109  */
    /* JADX INFO: renamed from: ۦؙ */
    public final boolean m3657(C4626 c4626, KeyEvent keyEvent) {
        MenuC4903 menuC4903;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        C5050 c5050;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.f6161) {
            boolean z = c4626.f15268;
            int i = c4626.f15262;
            if (z) {
                return true;
            }
            C4626 c4627 = this.f6168;
            if (c4627 != null && c4627 != c4626) {
                m3644(c4627, false);
            }
            Window.Callback callback = this.f6147.getCallback();
            if (callback != null) {
                c4626.f15269 = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.f6154) != null) {
                actionBarOverlayLayout4.m26();
                ((C0251) actionBarOverlayLayout4.f68).f932 = true;
            }
            if (c4626.f15269 == null) {
                MenuC4903 menuC4904 = c4626.f15261;
                if (menuC4904 == null || c4626.f15272) {
                    if (menuC4904 == null) {
                        Context context = this.f6156;
                        if ((i == 0 || i == 108) && this.f6154 != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(ru.bluecat.yandexmapspatcher.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(ru.bluecat.yandexmapspatcher.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(ru.bluecat.yandexmapspatcher.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                C5260 c5260 = new C5260(context, 0);
                                c5260.getTheme().setTo(themeNewTheme);
                                context = c5260;
                            }
                        }
                        MenuC4903 menuC4905 = new MenuC4903(context);
                        menuC4905.f16174 = this;
                        MenuC4903 menuC4906 = c4626.f15261;
                        if (menuC4905 != menuC4906) {
                            if (menuC4906 != null) {
                                menuC4906.m8300(c4626.f15267);
                            }
                            c4626.f15261 = menuC4905;
                            C5007 c5007 = c4626.f15267;
                            if (c5007 != null) {
                                menuC4905.m8303(c5007, menuC4905.f16182);
                            }
                        }
                        menuC4904 = c4626.f15261;
                        if (menuC4904 != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.f6154) != null) {
                                c5050 = this.f6162;
                                if (c5050 == null) {
                                    c5050 = new C5050(this);
                                    this.f6162 = c5050;
                                }
                                actionBarOverlayLayout2.m23(menuC4904, c5050);
                            }
                            c4626.f15261.m8302();
                            if (callback.onCreatePanelMenu(i, c4626.f15261)) {
                                c4626.f15272 = false;
                            } else {
                                menuC4903 = c4626.f15261;
                                if (menuC4903 != null) {
                                    if (menuC4903 != null) {
                                        menuC4903.m8300(c4626.f15267);
                                    }
                                    c4626.f15261 = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.f6154) != null) {
                                    actionBarOverlayLayout.m23(null, this.f6162);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            c5050 = this.f6162;
                            if (c5050 == null) {
                                c5050 = new C5050(this);
                                this.f6162 = c5050;
                            }
                            actionBarOverlayLayout2.m23(menuC4904, c5050);
                        }
                        c4626.f15261.m8302();
                        if (callback.onCreatePanelMenu(i, c4626.f15261)) {
                            menuC4903 = c4626.f15261;
                            if (menuC4903 != null) {
                                if (menuC4903 != null) {
                                    menuC4903.m8300(c4626.f15267);
                                }
                                c4626.f15261 = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.m23(null, this.f6162);
                            }
                        } else {
                            c4626.f15272 = false;
                        }
                    }
                }
                c4626.f15261.m8302();
                Bundle bundle = c4626.f15271;
                if (bundle != null) {
                    c4626.f15261.m8298(bundle);
                    c4626.f15271 = null;
                }
                if (!callback.onPreparePanel(0, c4626.f15269, c4626.f15261)) {
                    if (z2 && (actionBarOverlayLayout3 = this.f6154) != null) {
                        actionBarOverlayLayout3.m23(null, this.f6162);
                    }
                    c4626.f15261.m8310();
                    return false;
                }
                c4626.f15261.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c4626.f15261.m8310();
            }
            c4626.f15268 = true;
            c4626.f15264 = false;
            this.f6168 = c4626;
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC3533
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo3658(CharSequence charSequence) {
        this.f6183 = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6154;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        C4075 c4075 = this.f6170;
        if (c4075 == null) {
            TextView textView = this.f6190;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        C0251 c0251 = (C0251) c4075.f13570;
        if (c0251.f937) {
            return;
        }
        Toolbar toolbar = c0251.f930;
        c0251.f929 = charSequence;
        if ((c0251.f928 & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c0251.f937) {
                AbstractC3608.m6436(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // p000.AbstractC3533
    /* JADX INFO: renamed from: ۦِ */
    public final void mo3659(View view) {
        m3650();
        ViewGroup viewGroup = (ViewGroup) this.f6187.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f6144.m9580(this.f6147.getCallback());
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m3660() {
        if (this.f6147 == null) {
            Object obj = this.f6181;
            if (obj instanceof Activity) {
                m3667(((Activity) obj).getWindow());
            }
        }
        if (this.f6147 != null) {
            return;
        }
        C1078.m2276("We have not been given a Window");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0146 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:97:0x0133  */
    /* JADX WARN: Code duplicated, block: B:99:0x0137  */
    /* JADX INFO: renamed from: ۦٗ */
    public final boolean m3661(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        C4626 c4626M3641;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z;
        boolean z2;
        boolean zM3657;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        C4718 c4718;
        C4718 c4719;
        C4718 c47110;
        C4626 c4626M3642;
        Object obj = this.f6181;
        if ((!(obj instanceof InterfaceC0608) && !(obj instanceof DialogInterfaceC4964)) || (decorView = this.f6147.getDecorView()) == null || !AbstractC3608.m6433(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                WindowCallbackC5767 windowCallbackC5767 = this.f6144;
                Window.Callback callback = this.f6147.getCallback();
                windowCallbackC5767.getClass();
                try {
                    windowCallbackC5767.f19009 = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    windowCallbackC5767.f19009 = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.f6171 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    c4626M3642 = m3641(0);
                                    if (!c4626M3642.f15265) {
                                        m3657(c4626M3642, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.f6176 == null) {
                                    c4626M3641 = m3641(0);
                                    actionBarOverlayLayout = this.f6154;
                                    context = this.f6156;
                                    if (actionBarOverlayLayout != null) {
                                        actionBarOverlayLayout.m26();
                                        toolbar = ((C0251) actionBarOverlayLayout.f68).f930;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f159) == null || !actionMenuView.f98 || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z = c4626M3641.f15265;
                                            if (!z || c4626M3641.f15264) {
                                                m3644(c4626M3641, true);
                                                z2 = z;
                                            } else {
                                                if (c4626M3641.f15268) {
                                                    if (c4626M3641.f15272) {
                                                        c4626M3641.f15268 = false;
                                                        zM3657 = m3657(c4626M3641, keyEvent);
                                                    } else {
                                                        zM3657 = true;
                                                    }
                                                    if (zM3657) {
                                                        m3648(c4626M3641, keyEvent);
                                                        z2 = true;
                                                    }
                                                }
                                                z2 = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6154;
                                            actionBarOverlayLayout2.m26();
                                            ActionMenuView actionMenuView2 = ((C0251) actionBarOverlayLayout2.f68).f930.f159;
                                            if (actionMenuView2 == null || (c4719 = actionMenuView2.f96) == null || !c4719.m8051()) {
                                                if (!this.f6161 && m3657(c4626M3641, keyEvent)) {
                                                    ActionBarOverlayLayout actionBarOverlayLayout3 = this.f6154;
                                                    actionBarOverlayLayout3.m26();
                                                    ActionMenuView actionMenuView3 = ((C0251) actionBarOverlayLayout3.f68).f930.f159;
                                                    if (actionMenuView3 != null && (c4718 = actionMenuView3.f96) != null && c4718.m8053()) {
                                                        z2 = true;
                                                    }
                                                }
                                                z2 = false;
                                            } else {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = this.f6154;
                                                actionBarOverlayLayout4.m26();
                                                ActionMenuView actionMenuView4 = ((C0251) actionBarOverlayLayout4.f68).f930.f159;
                                                if (actionMenuView4 == null || (c47110 = actionMenuView4.f96) == null || !c47110.m8052()) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        z = c4626M3641.f15265;
                                        if (z) {
                                        }
                                        m3644(c4626M3641, true);
                                        z2 = z;
                                    }
                                    if (z2) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (m3662()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    windowCallbackC5767.f19009 = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.f6171 = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            c4626M3642 = m3641(0);
                            if (!c4626M3642.f15265) {
                                m3657(c4626M3642, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.f6176 == null) {
                            c4626M3641 = m3641(0);
                            actionBarOverlayLayout = this.f6154;
                            context = this.f6156;
                            if (actionBarOverlayLayout != null) {
                                actionBarOverlayLayout.m26();
                                toolbar = ((C0251) actionBarOverlayLayout.f68).f930;
                                if (toolbar.getVisibility() == 0) {
                                    z = c4626M3641.f15265;
                                    if (z) {
                                    }
                                    m3644(c4626M3641, true);
                                    z2 = z;
                                } else {
                                    z = c4626M3641.f15265;
                                    if (z) {
                                    }
                                    m3644(c4626M3641, true);
                                    z2 = z;
                                }
                            } else {
                                z = c4626M3641.f15265;
                                if (z) {
                                }
                                m3644(c4626M3641, true);
                                z2 = z;
                            }
                            if (z2) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (m3662()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final boolean m3662() {
        InterfaceC4870 interfaceC4870;
        C4796 c4796;
        boolean z = this.f6171;
        this.f6171 = false;
        C4626 c4626M3641 = m3641(0);
        if (!c4626M3641.f15265) {
            AbstractC3305 abstractC3305 = this.f6176;
            if (abstractC3305 != null) {
                abstractC3305.mo6070();
                return true;
            }
            m3640();
            C4075 c4075 = this.f6170;
            if (c4075 == null || (interfaceC4870 = c4075.f13570) == null || (c4796 = ((C0251) interfaceC4870).f930.f139) == null || c4796.f15817 == null) {
                return false;
            }
            C4796 c4797 = ((C0251) interfaceC4870).f930.f139;
            C1092 c1092 = c4797 == null ? null : c4797.f15817;
            if (c1092 != null) {
                c1092.collapseActionView();
            }
        } else if (!z) {
            m3644(c4626M3641, true);
            return true;
        }
        return true;
    }

    @Override // p000.AbstractC3533
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo3663(int i) {
        m3650();
        ViewGroup viewGroup = (ViewGroup) this.f6187.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f6156).inflate(i, viewGroup);
        this.f6144.m9580(this.f6147.getCallback());
    }

    @Override // p000.AbstractC3533
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo3664(View view, ViewGroup.LayoutParams layoutParams) {
        m3650();
        ViewGroup viewGroup = (ViewGroup) this.f6187.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f6144.m9580(this.f6147.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.m8051() != false) goto L20;
     */
    @Override // p000.InterfaceC0614
    /* JADX INFO: renamed from: ۦۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1378(p000.MenuC4903 r6) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C1852.mo1378(ۦۖؓۢۖ):void");
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۦۚ */
    public final boolean m3665(boolean z, boolean z2) {
        int i;
        boolean z3;
        if (this.f6161) {
            return false;
        }
        int i2 = this.f6166;
        if (i2 == -100) {
            i2 = AbstractC3533.f11723;
        }
        Context context = this.f6156;
        int iM3643 = m3643(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        C1257 c1257M3639 = i3 < 33 ? m3639(context) : null;
        if (!z2 && c1257M3639 != null) {
            c1257M3639 = AbstractC1937.m3800(context.getResources().getConfiguration());
        }
        Configuration configurationM3638 = m3638(context, iM3643, c1257M3639, null, false);
        boolean z4 = this.f6185;
        boolean z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        Object obj = this.f6181;
        if (z4 || !(obj instanceof Activity)) {
            this.f6185 = true;
            i = this.f6184;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f6184 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.f6184 = 0;
                }
                this.f6185 = true;
                i = this.f6184;
            }
        }
        Configuration configuration = this.f6175;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationM3638.uiMode & 48;
        C1257 c1257M3800 = AbstractC1937.m3800(configuration);
        C1257 c1257M3801 = c1257M3639 == null ? null : AbstractC1937.m3800(configurationM3638);
        int i6 = i4 != i5 ? 512 : 0;
        if (c1257M3801 != null && !c1257M3800.equals(c1257M3801)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.f6188 && ((f6143 || this.f6153) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationM3638.getLayoutDirection());
                }
                if (i7 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new RunnableC0029(z5 ? 1 : 0, activity));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (c1257M3801 != null) {
                AbstractC1937.m3802(configuration2, c1257M3801);
            }
            resources.updateConfiguration(configuration2, null);
            int i8 = this.f6172;
            if (i8 != 0) {
                context.setTheme(i8);
                context.getTheme().applyStyle(this.f6172, true);
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof InterfaceC4507) {
                    if (((InterfaceC4507) activity2).mo110().mo2387().m976(EnumC0458.f1653)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f6153 && !this.f6161) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (c1257M3801 != null) {
            AbstractC1937.m3799(AbstractC1937.m3800(context.getResources().getConfiguration()));
        }
        if (i2 == 0) {
            m3649(context).m5981();
        } else {
            C2467 c2467 = this.f6160;
            if (c2467 != null) {
                c2467.m5979();
            }
        }
        C2467 c2468 = this.f6186;
        if (i2 == 3) {
            if (c2468 == null) {
                c2468 = new C2467(this, context);
                this.f6186 = c2468;
            }
            c2468.m5981();
        } else if (c2468 != null) {
            c2468.m5979();
        }
        return z5;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final void m3666(int i) {
        C4626 c4626M3641 = m3641(i);
        if (c4626M3641.f15261 != null) {
            Bundle bundle = new Bundle();
            c4626M3641.f15261.m8301(bundle);
            if (bundle.size() > 0) {
                c4626M3641.f15271 = bundle;
            }
            c4626M3641.f15261.m8302();
            c4626M3641.f15261.clear();
        }
        c4626M3641.f15272 = true;
        c4626M3641.f15270 = true;
        if ((i == 108 || i == 0) && this.f6154 != null) {
            C4626 c4626M3642 = m3641(0);
            c4626M3642.f15268 = false;
            m3657(c4626M3642, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX INFO: renamed from: ۦۨ */
    public final void m3667(Window window) {
        Drawable drawableM307;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f6147 != null) {
            C1078.m2276("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC5767) {
            C1078.m2276("AppCompat has already installed itself into the Window");
            return;
        }
        WindowCallbackC5767 windowCallbackC5767 = new WindowCallbackC5767(this, callback);
        this.f6144 = windowCallbackC5767;
        window.setCallback(windowCallbackC5767);
        Context context = this.f6156;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f6142);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableM307 = null;
        } else {
            C3465 c3465M6241 = C3465.m6241();
            synchronized (c3465M6241) {
                drawableM307 = c3465M6241.f11498.m307(context, resourceId, true);
            }
        }
        if (drawableM307 != null) {
            window.setBackgroundDrawable(drawableM307);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f6147 = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f6151) != null) {
            return;
        }
        Object obj = this.f6181;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f6163) != null) {
            AbstractC1394.m2954(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f6163 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f6151 = AbstractC1394.m2956(activity);
            } else {
                this.f6151 = null;
            }
        } else {
            this.f6151 = null;
        }
        m3654();
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
