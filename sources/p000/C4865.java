package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦٟؖؔ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4865 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Window f16001;

    /* JADX INFO: renamed from: ۥَ */
    public final int f16002;

    /* JADX INFO: renamed from: ۥُ */
    public AlertController$RecycleListView f16003;

    /* JADX INFO: renamed from: ۥّ */
    public Button f16004;

    /* JADX INFO: renamed from: ۥْ */
    public final int f16005;

    /* JADX INFO: renamed from: ۥٓ */
    public final int f16006;

    /* JADX INFO: renamed from: ۥٖ */
    public final int f16007;

    /* JADX INFO: renamed from: ۥۗ */
    public final DialogInterfaceC4964 f16009;

    /* JADX INFO: renamed from: ۥۜ */
    public Button f16010;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f16011;

    /* JADX INFO: renamed from: ۦؑ */
    public CharSequence f16012;

    /* JADX INFO: renamed from: ۦؚ */
    public TextView f16013;

    /* JADX INFO: renamed from: ۦٌ */
    public TextView f16014;

    /* JADX INFO: renamed from: ۦِ */
    public Drawable f16015;

    /* JADX INFO: renamed from: ۦٗ */
    public final boolean f16016;

    /* JADX INFO: renamed from: ۦٛ */
    public NestedScrollView f16017;

    /* JADX INFO: renamed from: ۦۗ */
    public ImageView f16018;

    /* JADX INFO: renamed from: ۦۙ */
    public Button f16019;

    /* JADX INFO: renamed from: ۦۚ */
    public View f16020;

    /* JADX INFO: renamed from: ۦۛ */
    public final HandlerC4543 f16021;

    /* JADX INFO: renamed from: ۦۨ */
    public ListAdapter f16023;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f16022 = -1;

    /* JADX INFO: renamed from: ۥۖ */
    public final ViewOnClickListenerC3684 f16008 = new ViewOnClickListenerC3684(1, this);

    public C4865(Context context, DialogInterfaceC4964 dialogInterfaceC4964, Window window) {
        this.f16011 = context;
        this.f16009 = dialogInterfaceC4964;
        this.f16001 = window;
        HandlerC4543 handlerC4543 = new HandlerC4543();
        handlerC4543.f15009 = new WeakReference(dialogInterfaceC4964);
        this.f16021 = handlerC4543;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC5618.f18511, R.attr.alertDialogStyle, 0);
        this.f16005 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f16006 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f16002 = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f16007 = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f16016 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC4964.m8348().mo3652(1);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static ViewGroup m8223(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
