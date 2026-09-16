package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import p000.AbstractC5618;
import p000.C1092;
import p000.C5460;
import p000.InterfaceC3902;
import p000.MenuC4903;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC3902, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: ۥؓ */
    public boolean f15;

    /* JADX INFO: renamed from: ۥؖ */
    public final Context f16;

    /* JADX INFO: renamed from: ۥً */
    public final boolean f17;

    /* JADX INFO: renamed from: ۥَ */
    public CheckBox f18;

    /* JADX INFO: renamed from: ۥْ */
    public RadioButton f19;

    /* JADX INFO: renamed from: ۥٓ */
    public TextView f20;

    /* JADX INFO: renamed from: ۥٕ */
    public boolean f21;

    /* JADX INFO: renamed from: ۥٖ */
    public TextView f22;

    /* JADX INFO: renamed from: ۥٙ */
    public final int f23;

    /* JADX INFO: renamed from: ۥۖ */
    public LinearLayout f24;

    /* JADX INFO: renamed from: ۥۧ */
    public final Drawable f25;

    /* JADX INFO: renamed from: ۦٕ */
    public final Drawable f26;

    /* JADX INFO: renamed from: ۦٗ */
    public ImageView f27;

    /* JADX INFO: renamed from: ۦٚ */
    public LayoutInflater f28;

    /* JADX INFO: renamed from: ۦۛ */
    public ImageView f29;

    /* JADX INFO: renamed from: ۦ۟ */
    public ImageView f30;

    /* JADX INFO: renamed from: ۦۨ */
    public C1092 f31;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5460 c5460M9119 = C5460.m9119(getContext(), attributeSet, AbstractC5618.f18514, R.attr.listMenuViewStyle);
        this.f26 = c5460M9119.m9123(5);
        TypedArray typedArray = (TypedArray) c5460M9119.f17999;
        this.f23 = typedArray.getResourceId(1, -1);
        this.f15 = typedArray.getBoolean(7, false);
        this.f16 = context;
        this.f25 = c5460M9119.m9123(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f17 = typedArrayObtainStyledAttributes.hasValue(0);
        c5460M9119.m9126();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.f28;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        this.f28 = layoutInflaterFrom;
        return layoutInflaterFrom;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f27;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f29;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f29.getLayoutParams();
        rect.top = this.f29.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // p000.InterfaceC3902
    public C1092 getItemData() {
        return this.f31;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f26);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f20 = textView;
        int i = this.f23;
        if (i != -1) {
            textView.setTextAppearance(this.f16, i);
        }
        this.f22 = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f27 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f25);
        }
        this.f29 = (ImageView) findViewById(R.id.group_divider);
        this.f24 = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f30 != null && this.f15) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f30.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (!z && this.f19 == null && this.f18 == null) {
            return;
        }
        if ((this.f31.f3829 & 4) != 0) {
            if (this.f19 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f19 = radioButton;
                LinearLayout linearLayout = this.f24;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f19;
            compoundButton2 = this.f18;
            compoundButton3 = compoundButton2;
        } else {
            if (this.f18 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f18 = checkBox;
                LinearLayout linearLayout2 = this.f24;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f18;
            compoundButton2 = this.f19;
            compoundButton3 = compoundButton;
        }
        if (!z) {
            if (compoundButton3 != null) {
                compoundButton3.setVisibility(8);
            }
            RadioButton radioButton2 = this.f19;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.f31.isChecked());
        if (compoundButton.getVisibility() != 0) {
            compoundButton.setVisibility(0);
        }
        if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
            return;
        }
        compoundButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f31.f3829 & 4) != 0) {
            if (this.f19 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f19 = radioButton;
                LinearLayout linearLayout = this.f24;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f19;
        } else {
            if (this.f18 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f18 = checkBox;
                LinearLayout linearLayout2 = this.f24;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f18;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f21 = z;
        this.f15 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f29;
        if (imageView != null) {
            imageView.setVisibility((this.f17 || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        MenuC4903 menuC4903 = this.f31.f3834;
        boolean z = this.f21;
        if (z || this.f15) {
            ImageView imageView = this.f30;
            if (imageView == null && drawable == null && !this.f15) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f30 = imageView2;
                LinearLayout linearLayout = this.f24;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f15) {
                this.f30.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f30;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f30.getVisibility() != 0) {
                this.f30.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f20;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.f20.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.f20.getVisibility() != 0) {
                this.f20.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    @Override // p000.InterfaceC3902
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3(C1092 c1092) {
        boolean z;
        int i;
        String string;
        this.f31 = c1092;
        boolean zIsVisible = c1092.isVisible();
        MenuC4903 menuC4903 = c1092.f3834;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(c1092.f3814);
        setCheckable(c1092.isCheckable());
        if (menuC4903.mo7312()) {
            if ((menuC4903.mo7311() ? c1092.f3828 : c1092.f3822) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        menuC4903.mo7311();
        if (z) {
            C1092 c1093 = this.f31;
            MenuC4903 menuC4904 = c1093.f3834;
            if (menuC4904.mo7312()) {
                i = (menuC4904.mo7311() ? c1093.f3828 : c1093.f3822) == 0 ? 8 : 0;
            }
        }
        if (i == 0) {
            TextView textView = this.f22;
            C1092 c1094 = this.f31;
            MenuC4903 menuC4905 = c1094.f3834;
            Context context = menuC4905.f16182;
            char c = menuC4905.mo7311() ? c1094.f3828 : c1094.f3822;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = menuC4905.mo7311() ? c1094.f3832 : c1094.f3831;
                C1092.m2301(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                C1092.m2301(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                C1092.m2301(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                C1092.m2301(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                C1092.m2301(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                C1092.m2301(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f22.getVisibility() != i) {
            this.f22.setVisibility(i);
        }
        setIcon(c1092.getIcon());
        setEnabled(c1092.isEnabled());
        setSubMenuArrowVisible(c1092.hasSubMenu());
        setContentDescription(c1092.f3816);
    }
}
