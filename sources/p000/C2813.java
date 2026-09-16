package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥۦؘُؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2813 implements InterfaceC4844 {

    /* JADX INFO: renamed from: ۥَ */
    public Object f9388;

    /* JADX INFO: renamed from: ۥْ */
    public Object f9389;

    /* JADX INFO: renamed from: ۥٓ */
    public Object f9390;

    /* JADX INFO: renamed from: ۥٖ */
    public Object f9391;

    /* JADX INFO: renamed from: ۦٗ */
    public Object f9392;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f9393;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f9394;

    public C2813(C5221 c5221, InterfaceC4844 interfaceC4844) {
        this.f9394 = 5;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<C0332> set = c5221.f17236;
        Set set2 = c5221.f17242;
        for (C0332 c0332 : set) {
            int i = c0332.f1240;
            int i2 = c0332.f1241;
            boolean z = i == 0;
            C1166 c1166 = c0332.f1242;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(c1166);
                } else {
                    hashSet.add(c1166);
                }
            } else if (i == 2) {
                hashSet3.add(c1166);
            } else if (i2 == 2) {
                hashSet5.add(c1166);
            } else {
                hashSet2.add(c1166);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(C1166.m2484(InterfaceC0604.class));
        }
        this.f9393 = Collections.unmodifiableSet(hashSet);
        this.f9389 = Collections.unmodifiableSet(hashSet2);
        this.f9390 = Collections.unmodifiableSet(hashSet3);
        this.f9388 = Collections.unmodifiableSet(hashSet4);
        this.f9391 = Collections.unmodifiableSet(hashSet5);
        this.f9392 = interfaceC4844;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static boolean m5361(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static LayerDrawable m5362(C0141 c0141, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM311 = c0141.m311(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM312 = c0141.m311(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM311 instanceof BitmapDrawable) && drawableM311.getIntrinsicWidth() == dimensionPixelSize && drawableM311.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM311;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM311.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM311.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM312 instanceof BitmapDrawable) && drawableM312.getIntrinsicWidth() == dimensionPixelSize && drawableM312.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM312;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM312.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM312.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static ColorStateList m5363(Context context, int i) {
        int iM8832 = AbstractC5216.m8832(context, R.attr.colorControlHighlight);
        int iM8833 = AbstractC5216.m8833(context, R.attr.colorButtonNormal);
        int[] iArr = AbstractC5216.f17227;
        int[] iArr2 = AbstractC5216.f17229;
        int iM2910 = AbstractC1373.m2910(iM8832, i);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC5216.f17224, AbstractC5216.f17226}, new int[]{iM8833, iM2910, AbstractC1373.m2910(iM8832, i), i});
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static void m5364(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM305;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C3465.f11497;
        }
        PorterDuff.Mode mode2 = C3465.f11497;
        synchronized (C3465.class) {
            porterDuffColorFilterM305 = C0141.m305(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterM305);
    }

    public String toString() {
        switch (this.f9394) {
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                Map map = (Map) this.f9391;
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f9389);
                sb.append(", url=");
                sb.append((C0774) this.f9393);
                C4714 c4714 = (C4714) this.f9390;
                if (c4714.size() != 0) {
                    sb.append(", headers=[");
                    Iterator it = c4714.iterator();
                    int i = 0;
                    while (true) {
                        C0084 c0084 = (C0084) it;
                        if (c0084.hasNext()) {
                            Object next = c0084.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                AbstractC2164.m4180();
                                throw null;
                            }
                            C3869 c3869 = (C3869) next;
                            String str = (String) c3869.f12915;
                            String str2 = (String) c3869.f12914;
                            if (i > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                            sb.append(':');
                            sb.append(str2);
                            i = i2;
                        } else {
                            sb.append(']');
                        }
                    }
                }
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC4844
    /* JADX INFO: renamed from: ۥؗ */
    public Set mo5365(C1166 c1166) {
        if (((Set) this.f9388).contains(c1166)) {
            return ((InterfaceC4844) this.f9392).mo5365(c1166);
        }
        C0178.m388(c1166, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    @Override // p000.InterfaceC4844
    /* JADX INFO: renamed from: ۥُ */
    public C1510 mo5366(C1166 c1166) {
        if (((Set) this.f9390).contains(c1166)) {
            return ((InterfaceC4844) this.f9392).mo5366(c1166);
        }
        C0178.m388(c1166, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    @Override // p000.InterfaceC4844
    /* JADX INFO: renamed from: ۥّ */
    public InterfaceC2090 mo5367(C1166 c1166) {
        if (((Set) this.f9389).contains(c1166)) {
            return ((InterfaceC4844) this.f9392).mo5367(c1166);
        }
        C0178.m388(c1166, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    /* JADX INFO: renamed from: ۥْ */
    public void m5368(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = AbstractC1410.f4847;
        this.f9391 = str;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public Uri m5369() {
        String strM6622;
        String str = (String) this.f9389;
        String str2 = (String) this.f9390;
        Account account = AbstractC3962.f13246;
        Account account2 = (Account) this.f9388;
        AbstractC2552.m4830(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        AbstractC2552.m4830(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        AbstractC2552.m4830(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (AbstractC3962.f13246.equals(account2)) {
            strM6622 = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strM6622 = AbstractC3761.m6622(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.f9391;
        StringBuilder sb = new StringBuilder(strM6622.length() + str2.length() + str.length() + 2 + 1 + 1 + str5.length());
        sb.append("/");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append("/");
        sb.append(strM6622);
        sb.append("/");
        sb.append(str5);
        return new Uri.Builder().scheme("android").authority((String) this.f9393).path(sb.toString()).encodedFragment(AbstractC0621.m1387(((C3094) this.f9392).m5682())).build();
    }

    @Override // p000.InterfaceC4844
    /* JADX INFO: renamed from: ۥۗ */
    public InterfaceC2090 mo5370(C1166 c1166) {
        if (((Set) this.f9391).contains(c1166)) {
            return ((InterfaceC4844) this.f9392).mo5370(c1166);
        }
        C0178.m388(c1166, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    @Override // p000.InterfaceC4844
    /* JADX INFO: renamed from: ۥۣ */
    public Object mo5371(Class cls) {
        if (!((Set) this.f9393).contains(C1166.m2484(cls))) {
            C0178.m388(cls, ".", "Attempting to request an undeclared dependency ");
            return null;
        }
        Object objMo5371 = ((InterfaceC4844) this.f9392).mo5371(cls);
        if (!cls.equals(InterfaceC0604.class)) {
            return objMo5371;
        }
        return new C0350();
    }

    @Override // p000.InterfaceC4844
    /* JADX INFO: renamed from: ۦؑ */
    public InterfaceC2090 mo5372(Class cls) {
        return mo5367(C1166.m2484(cls));
    }

    /* JADX INFO: renamed from: ۦٌ */
    public ColorStateList m5373(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC4225.m7481(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC4225.m7481(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m5363(context, AbstractC5216.m8832(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m5363(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m5363(context, AbstractC5216.m8832(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC4225.m7481(context, R.color.abc_tint_spinner);
            }
            if (m5361((int[]) this.f9389, i)) {
                return AbstractC5216.m8835(context, R.attr.colorControlNormal);
            }
            if (m5361((int[]) this.f9391, i)) {
                return AbstractC4225.m7481(context, R.color.abc_tint_default);
            }
            if (m5361((int[]) this.f9392, i)) {
                return AbstractC4225.m7481(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC4225.m7481(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM8835 = AbstractC5216.m8835(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM8835 == null || !colorStateListM8835.isStateful()) {
            iArr[0] = AbstractC5216.f17227;
            iArr2[0] = AbstractC5216.m8833(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC5216.f17225;
            iArr2[1] = AbstractC5216.m8832(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC5216.f17226;
            iArr2[2] = AbstractC5216.m8832(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC5216.f17227;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM8835.getColorForState(iArr3, 0);
            iArr[1] = AbstractC5216.f17225;
            iArr2[1] = AbstractC5216.m8832(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC5216.f17226;
            iArr2[2] = colorStateListM8835.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public C1035 m5374() {
        C1035 c1035 = (C1035) this.f9392;
        if (c1035 != null) {
            return c1035;
        }
        C1035 c1035M4195 = AbstractC2164.m4195((C4714) this.f9390);
        this.f9392 = c1035M4195;
        return c1035M4195;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public C1510 m5375(Class cls) {
        return mo5366(C1166.m2484(cls));
    }

    @Override // p000.InterfaceC4844
    /* JADX INFO: renamed from: ۦۙ */
    public Object mo5376(C1166 c1166) {
        if (((Set) this.f9393).contains(c1166)) {
            return ((InterfaceC4844) this.f9392).mo5376(c1166);
        }
        C0178.m388(c1166, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public C1414 m5377() {
        C1414 c1414 = new C1414(false);
        c1414.f4870 = new LinkedHashMap();
        c1414.f4871 = (C0774) this.f9393;
        c1414.f4868 = (String) this.f9389;
        c1414.f4867 = (AbstractC2577) this.f9388;
        Map map = (Map) this.f9391;
        c1414.f4870 = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        c1414.f4869 = ((C4714) this.f9390).m8046();
        return c1414;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public void m5378(String str) {
        AbstractC2552.m4830(AbstractC1410.f4847.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        AbstractC2552.m4830(!AbstractC1410.f4845.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.f9390 = str;
    }

    public C2813(Set set, String str, String str2) {
        this.f9394 = 1;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f9393 = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f9390 = str;
        this.f9388 = str2;
        this.f9391 = C2478.f8258;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f9389 = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw AbstractC5078.m8675(it);
    }

    public C2813(C0774 c0774, String str, C4714 c4714, AbstractC2577 abstractC2577, Map map) {
        this.f9394 = 4;
        this.f9393 = c0774;
        this.f9389 = str;
        this.f9390 = c4714;
        this.f9388 = abstractC2577;
        this.f9391 = map;
    }

    public C2813(Context context) {
        this.f9394 = 7;
        this.f9389 = "files";
        this.f9390 = "common";
        this.f9388 = AbstractC1410.f4846;
        this.f9391 = "";
        C1868 c1868 = AbstractC4822.f15887;
        this.f9392 = new C3094(4);
        this.f9393 = context.getPackageName();
    }

    public C2813(C5086 c5086) {
        this.f9394 = 2;
        this.f9393 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC5429(false));
        C0649 c0649 = AbstractC0912.f3276;
        this.f9389 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC5429(true));
        this.f9390 = new C4575(0);
        this.f9388 = (C4010) c5086.f16877;
        this.f9391 = new C4228(18);
        this.f9392 = new C4992(2);
    }

    public C2813(int i) {
        this.f9394 = i;
        switch (i) {
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            default:
                this.f9393 = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.f9389 = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f9390 = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.f9388 = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.f9391 = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f9392 = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    public C2813(C2680 c2680) {
        this.f9394 = 3;
        this.f9393 = c2680;
        this.f9392 = AbstractC1918.f6319;
    }
}
