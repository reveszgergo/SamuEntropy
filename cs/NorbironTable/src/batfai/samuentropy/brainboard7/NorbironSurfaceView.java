/*
 * NorbironSurfaceView.java
 *
 * Norbiron Game
 * This is a case study for creating sprites for SamuEntropy/Brainboard.
 *
 * Copyright (C) 2016, Dr. Bátfai Norbert
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Ez a program szabad szoftver; terjeszthető illetve módosítható a
 * Free Software Foundation által kiadott GNU General Public License
 * dokumentumában leírtak; akár a licenc 3-as, akár (tetszőleges) későbbi
 * változata szerint.
 *
 * Ez a program abban a reményben kerül közreadásra, hogy hasznos lesz,
 * de minden egyéb GARANCIA NÉLKÜL, az ELADHATÓSÁGRA vagy VALAMELY CÉLRA
 * VALÓ ALKALMAZHATÓSÁGRA való származtatott garanciát is beleértve.
 * További részleteket a GNU General Public License tartalmaz.
 *
 * A felhasználónak a programmal együtt meg kell kapnia a GNU General
 * Public License egy példányát; ha mégsem kapta meg, akkor
 * tekintse meg a <http://www.gnu.org/licenses/> oldalon.
 *
 * Version history:
 *
 * 0.0.1, 2013.szept.29.
 */
package batfai.samuentropy.brainboard7;
import android.util.Log;

import android.preference.PreferenceManager;


class Nodes {

    private android.graphics.Bitmap boardPic;
    private android.graphics.Bitmap neuronSprite;
    private android.graphics.Bitmap nandIronProcCover;
    private static NeuronBox[] neuronBox;


    public Nodes(android.view.SurfaceView surfaceView) {
        int resId = surfaceView.getResources().getIdentifier("pcb550i", "drawable",
                "batfai.samuentropy.brainboard7");

        boardPic = android.graphics.BitmapFactory.decodeResource(surfaceView.getResources(), resId);

        boardPic = android.graphics.Bitmap.createScaledBitmap(boardPic, 300, 300, false);

        resId = surfaceView.getResources().getIdentifier("neuronsprite", "drawable",
                "batfai.samuentropy.brainboard7");

        neuronSprite = android.graphics.BitmapFactory.decodeResource(surfaceView.getResources(), resId);

        neuronSprite = android.graphics.Bitmap.createScaledBitmap(neuronSprite, 64 * 2 * 14, 62, false);

        resId = surfaceView.getResources().getIdentifier("nandironproci", "drawable",
                "batfai.samuentropy.brainboard7");
        nandIronProcCover = android.graphics.BitmapFactory.decodeResource(surfaceView.getResources(), resId);
        nandIronProcCover = android.graphics.Bitmap.createScaledBitmap(nandIronProcCover, 168, 197, false);

        neuronBox = new NeuronBox[7];
        neuronBox[0] = new NeuronBox(neuronSprite, 2 * 14, 64, 62, 100, nandIronProcCover, 64, 360,0);

        resId = surfaceView.getResources().getIdentifier("nandironproci2", "drawable",
                "batfai.samuentropy.brainboard7");
        nandIronProcCover = android.graphics.BitmapFactory.decodeResource(surfaceView.getResources(), resId);
        nandIronProcCover = android.graphics.Bitmap.createScaledBitmap(nandIronProcCover, 168, 197, false);

        neuronBox[1] = new NeuronBox(neuronSprite, 2 * 14, 64, 62, 10, nandIronProcCover, 362, 360,1);

        resId = surfaceView.getResources().getIdentifier("matyironproci", "drawable",
                "batfai.samuentropy.brainboard7");
        nandIronProcCover = android.graphics.BitmapFactory.decodeResource(surfaceView.getResources(), resId);
        nandIronProcCover = android.graphics.Bitmap.createScaledBitmap(nandIronProcCover, 168, 197, false);

        neuronBox[2] = new NeuronBox(neuronSprite, 2 * 14, 64, 62, 15, nandIronProcCover, 64, 658,2);

        resId = surfaceView.getResources().getIdentifier("matyironproci2", "drawable",
                "batfai.samuentropy.brainboard7");
        nandIronProcCover = android.graphics.BitmapFactory.decodeResource(surfaceView.getResources(), resId);
        nandIronProcCover = android.graphics.Bitmap.createScaledBitmap(nandIronProcCover, 168, 197, false);

        neuronBox[3] = new NeuronBox(neuronSprite, 2 * 14, 64, 62, 100, nandIronProcCover, 362, 658,3);

        resId = surfaceView.getResources().getIdentifier("gretironproci", "drawable",
                "batfai.samuentropy.brainboard7");
        nandIronProcCover = android.graphics.BitmapFactory.decodeResource(surfaceView.getResources(), resId);
        nandIronProcCover = android.graphics.Bitmap.createScaledBitmap(nandIronProcCover, 168, 197, false);

        neuronBox[4] = new NeuronBox(neuronSprite, 2 * 14, 64, 62, 10, nandIronProcCover, 64, 956,4);

        resId = surfaceView.getResources().getIdentifier("gretironproci2", "drawable",
                "batfai.samuentropy.brainboard7");
        nandIronProcCover = android.graphics.BitmapFactory.decodeResource(surfaceView.getResources(), resId);
        nandIronProcCover = android.graphics.Bitmap.createScaledBitmap(nandIronProcCover, 168, 197, false);

        neuronBox[5] = new NeuronBox(neuronSprite, 2 * 14, 64, 62, 15, nandIronProcCover, 362, 956,5);

        resId = surfaceView.getResources().getIdentifier("buildproci", "drawable",
                "batfai.samuentropy.brainboard7");
        nandIronProcCover = android.graphics.BitmapFactory.decodeResource(surfaceView.getResources(), resId);
        nandIronProcCover = android.graphics.Bitmap.createScaledBitmap(nandIronProcCover, 168, 197, false);

        neuronBox[6] = new NeuronBox(neuronSprite, 2 * 14, 64, 62, 15, nandIronProcCover, 64, 62,6);
        neuronBox[6].setType(0);



    }

    public android.graphics.Bitmap getBoardPic() {
        return boardPic;
    }

    public static NeuronBox get(int i) {
        return neuronBox[i];
    }

    public int getSize() {
        return neuronBox.length;
    }

}

/**
 *
 * @author nbatfai
 */
public class NorbironSurfaceView extends android.view.SurfaceView implements Runnable {


    private boolean buildPro = false;

    private final long DPress = 250;
    private long lastPressTime = 0;
    private boolean DoubleTap = false;

    private float startsx = 0;
    private float startsy = 0;
    private float width = 2048;
    private float height = 2048;

    protected float swidth;
    protected float sheight;

    protected float fromsx;
    protected float fromsy;

    protected float boardx = 0;
    protected float boardy = 0;

    private Nodes nodes;
    protected static java.util.List<NeuronBox> nodeBoxes = new java.util.ArrayList<NeuronBox>();

    protected NeuronBox selNb = null;
    public static boolean load=false;

    private android.view.SurfaceHolder surfaceHolder;
    private android.view.ScaleGestureDetector scaleGestureDetector;
    private float scaleFactor = 1.0f;

    private boolean running = true;

    private android.content.Context context;

    public void setScaleFactor(float scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    public float getScaleFactor() {
        return scaleFactor;
    }

    public static void saveData(android.content.SharedPreferences.Editor editor) {
        int i=0;
        for(NeuronBox nb : nodeBoxes) {
            editor.putInt("x"+i ,nb.x);
            editor.putInt("y"+i ,nb.y);
            editor.putInt("db"+i, nb.numberOfNeurons);
            editor.putInt("type" + i, nb.ctype);
            editor.putBoolean("selected"+i, nb.getSelected());
            editor.putBoolean("open"+i, nb.getCover());

            i++;
        }
        load=true;
        editor.putBoolean("load",true);
        editor.putInt("size", nodeBoxes.size());
        editor.commit();
    }

    public static void loadData(android.content.SharedPreferences settings) {
        if (settings.getBoolean("load",true)) {
            for (int i = 0; i < settings.getInt("size", 0); i++) {
                int ctype = settings.getInt("type" + i, 0);
                NeuronBox box = (NeuronBox) Nodes.get(ctype).clone();
                nodeBoxes.add(box);
                box.setXY(settings.getInt("x" + i, 0), settings.getInt("y" + i, 0));
                box.numberOfNeurons = settings.getInt("db" + i, 0);
                box.setSelected(settings.getBoolean("selected" + i, false));
                box.setCover(settings.getBoolean("open" + i, false));
            }
        }
    }

    public NorbironSurfaceView(android.content.Context context) {
        super(context);

        cinit(context);

    }

    public NorbironSurfaceView(android.content.Context context,
            android.util.AttributeSet attrs) {
        super(context, attrs);

        cinit(context);

    }

    public NorbironSurfaceView(android.content.Context context,
            android.util.AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        cinit(context);

    }



    @Override
    protected void onSizeChanged(int newx, int newy, int x, int y) {

        super.onSizeChanged(newx, newy, x, y);

        width = newx;
        height = newy;

        swidth = width / 2 - nodes.getBoardPic().getWidth() / 2;
        sheight = height / 2 - nodes.getBoardPic().getHeight() / 2;

    }


    private void cinit(android.content.Context context) {

        this.context = context;
        nodes = new Nodes(this);




       /* nodeBoxes.clear();
        loadData(PreferenceManager.getDefaultSharedPreferences(context));*/

        android.content.Intent intent = ((NeuronGameActivity) context).getIntent();
        android.os.Bundle bundle = intent.getExtras();

        if (!NeuronGameActivity.restore) {
                nodeBoxes.clear();
                loadData(PreferenceManager.getDefaultSharedPreferences(context));
            }

       if (bundle != null) {
            int i = bundle.getInt("selectedNode");


            nodeBoxes.add((NeuronBox) nodes.get(i).clone());
        }

        if (nodeBoxes.size() == 0) {
            nodeBoxes.add((NeuronBox) nodes.get(6).clone());
        }

        surfaceHolder = getHolder();
        surfaceHolder.addCallback(new SurfaceEvents(this));

        scaleGestureDetector = new android.view.ScaleGestureDetector(context, new ScaleAdapter(this));

    }

    @Override
    public void onDraw(android.graphics.Canvas canvas) {

        if (surfaceHolder.getSurface().isValid()) {

            canvas.save();
            canvas.scale(scaleFactor, scaleFactor);

            canvas.drawColor(android.graphics.Color.BLACK);

            for (int i = 0; i < 10; ++i) {
                for (int j = 0; j < 10; ++j) {
                    canvas.drawBitmap(nodes.getBoardPic(), -startsx + boardx + i * 300, -startsy + boardy + j * 300, null);
                }
            }

            if(!buildPro){
                for (NeuronBox nb : new java.util.ArrayList<NeuronBox>(nodeBoxes)) {
                    if(nb.getType() == 0){
                        nb.setXY(64, 62);
                    }

                    nb.draw(-startsx, -startsy, canvas);

                }
            }

            else {

                for (int i = 0;i < nodeBoxes.size();i++) {
                nodeBoxes.get(i).draw(-startsx, -startsy, canvas);

                }
                nodeBoxes.add((NeuronBox) nodes.get(6).clone());

            }

            canvas.restore();

    }
}

    public void repaint() {

        android.graphics.Canvas canvas = null;
        try {
            canvas = surfaceHolder.lockCanvas();
            if (canvas != null) {
                onDraw(canvas);
            }

        } finally {

            if (canvas != null) {
                surfaceHolder.unlockCanvasAndPost(canvas);
            }

        }
    }

    public float d(float x1, float x2, float y1, float y2) {

        return (x1 - y1) * (x1 - y1) + (x2 - y2) * (x2 - y2);
    }

    protected NeuronBox nearestNeuronBox(float x, float y) {

        NeuronBox r = null;
        float max = 10000, m;



          for (int i = 0;i < nodeBoxes.size();i++) {

            if ((m = d(nodeBoxes.get(i).getX() + nodeBoxes.get(i).getWidth() / 2, nodeBoxes.get(i).getY() + nodeBoxes.get(i).getHeight() / 2, x, y)) < max) {
                max = m;
                r = nodeBoxes.get(i);
            }
        }
        return r;
    }

    public void newNode() {

        android.content.Intent i = new android.content.Intent(context, NodeActivity.class);
        context.startActivity(i);

    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent event) {

        scaleGestureDetector.onTouchEvent(event);

        float x = event.getX() / scaleFactor;
        float y = event.getY() / scaleFactor;

        if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {

            long pressTime = System.currentTimeMillis();

            if (pressTime - lastPressTime < DPress)
                DoubleTap = true;
            else
                DoubleTap = false;
            lastPressTime = pressTime;

            fromsx = x;
            fromsy = y;

            NeuronBox nb = nearestNeuronBox(x + startsx, y + startsy);
            if (nb != null) {

                if (nb.getType() == 0) {
                    if (!nb.getSelected()) {
                        nb.setCover(false);
                        newNode();
                    }
                }


          else if (!DoubleTap)
                {
                    nb.setCover(!nb.getCover());
                    nb.setSelected(!nb.getSelected());
                    selNb = nb;
                }
                else
                {
                    DoubleTap=false;
                    nodeBoxes.remove(nb);
                }


            } else {
                selNb = null;
            }

        } else if (event.getAction() == android.view.MotionEvent.ACTION_POINTER_DOWN) {

            if (selNb != null) {
                selNb = null;
            }

        } else if (event.getAction() == android.view.MotionEvent.ACTION_CANCEL) {

        } else if (event.getAction() == android.view.MotionEvent.ACTION_MOVE) {

            if (selNb != null) {
                selNb.setXY(selNb.getX() - (fromsx - x), selNb.getY() - (fromsy - y));

                fromsx = x;
                fromsy = y;

            } else if (Math.abs(fromsx - x) + Math.abs(fromsy - y) > 25) {
                startsx += (fromsx - x);
                startsy += (fromsy - y);

                fromsx = x;
                fromsy = y;
            }

            repaint();

        } else if (event.getAction() == android.view.MotionEvent.ACTION_UP) {

            }



        return true;
    }

    public void stop() {
        //saveData(PreferenceManager.getDefaultSharedPreferences(context).edit());

        running = false;
    }

    @Override
    public void run() {
        long now = System.currentTimeMillis(), newnow;
        float spritex = 0;
        running = true;
        while (running) {

            if ((newnow = System.currentTimeMillis()) - now > 100) {



                for (int i = 0;i < nodeBoxes.size();i++) {
                    nodeBoxes.get(i).step();
                }

                repaint();

                now = newnow;
            }

        }

    }
}
